package com.epic.atemlogin.util.common;

import com.epic.atemlogin.util.mapping.Audittrace;
import com.epic.atemlogin.util.mapping.Users;
import com.epic.atemlogin.util.varlist.CommonVarList;
import com.epic.atemlogin.util.varlist.SessionVarlist;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Roshen
 */
public class Common {

    public static String replaceEmptyorNullString(String str) {
        if (str == null || str.trim().isEmpty()) {
            str = CommonVarList.EMPTY_OR_NULL_REPLACE_VALUE;
        }
        return str;
    }

    //format date into dd/MM/yyyy hh:mm:ss a
    public static String getFormattedDate(Timestamp ts) {
        String fDate = "";
        String pattern = "dd/MM/yyyy hh:mm:ss a";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        fDate = dateFormat.format(ts);
        return fDate;
    }

    //format dtae into yyyy-MM-dd HH:mm:ss
    public static String getDatetoFromattedDateString(String st) throws ParseException {
        String fDate = "";
        DateFormat readFormat = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat writeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = readFormat.parse(st);
        if (date != null) {
            fDate = writeFormat.format(date);
        }
        return fDate;
    }

    //format date into dd/MM/yyyy hh:mm:ss a
    public static String getFormattedSring(String st) throws ParseException {
        String fDate = "";
        DateFormat readFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat writeFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        Date date = readFormat.parse(st);
        if (date != null) {
            fDate = writeFormat.format(date);
        }
        return fDate;
    }

    //format date into dd/MM/yyyy hh:mm:ss a
    public static String formatDatetoDateString(Date d) {
        String fDate = "";
        try {
            String pattern = "dd/MM/yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
            fDate = dateFormat.format(d);
        } catch (Exception e) {
            fDate = "--";
        }
        return fDate;
    }

    public static String getCurrentUsername() {
        String uname = null;
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession(false);
        Users sysUser = (Users) session.getAttribute(SessionVarlist.SYSTEMUSER);
        if (sysUser != null && sysUser.getUsername() != null) {
            uname = sysUser.getUsername().toString();
        }
        return uname;
    }

    public static Users getCurrentUser() {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession(false);
        Users sysUser = (Users) session.getAttribute(SessionVarlist.SYSTEMUSER);
        return sysUser;
    }

    //format numbers into currency format
    //ex : 2500 -> 2,500.00
    public static String formatStringtoCurrency(String number) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        try {
            float value = Float.parseFloat(number);
            return nf.format(value);
        } catch (NumberFormatException e) {
            if (e.getMessage().equals("empty String")) {
                return "0.00";
            }
            return "--";
        } catch (NullPointerException e) {
            return "--";
        }
    }

    //format date into dd/MM/yyyy hh:mm:ss a
    public static String formatDatetoString(Date d) {
        String fDate = "";
        try {
            String pattern = "dd/MM/yyyy hh:mm:ss a";
            SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
            fDate = dateFormat.format(d);
        } catch (Exception e) {
            fDate = "--";
        }
        return fDate;
    }

    //format string dd/MM/yyyy into  date
    public static Date formatStringtoDate(String date) throws Exception {
        Date fdate = null;
        try {
            String pattern = "dd/MM/yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
            fdate = dateFormat.parse(date);
        } catch (Exception e) {
            throw e;
        }
        return fdate;
    }

    //format string yyyy-MM-dd HH:mm:ss into  date
    public static Date formatStringtoDatePattern(String date) throws Exception {
        Date fdate = null;
        try {
            String pattern = "yyyy-MM-dd HH:mm:ss";
            SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
            fdate = dateFormat.parse(date);
        } catch (Exception e) {
            throw e;
        }
        return fdate;
    }

    public static String toconvertStringtoString(String strDate) throws Exception {
        String ddate = null;
        try {

            SimpleDateFormat dFormat = new SimpleDateFormat("yyyymm");

            SimpleDateFormat dFormatFinal = new SimpleDateFormat("YYmm");
            Date date = dFormat.parse(strDate);
            ddate = dFormatFinal.format(date);
        } catch (Exception e) {
            throw new Exception("Invalid Date!!!!", e);
        }
        return ddate;
    }

    public static Date toconvertStringtoDate(String date) throws Exception {
        DateFormat formatter = null;
        Date convertedDate = null;

        try {
            formatter = new SimpleDateFormat("yyMM");
            convertedDate = (Date) formatter.parse(date);

        } catch (Exception e) {
            throw e;
        }
        return convertedDate;
    }

    //format date into dd/MM/yyyy hh:mm:ss a
    public static String toconvertDatetoString(Date d) {
        String fDate = "";
        try {
            String pattern = "yyyyMM";
            SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
            fDate = dateFormat.format(d);
        } catch (Exception e) {
            fDate = "--";
        }
        return fDate;
    }

    //Make Audittrace
    public static Audittrace makeAudittrace(HttpServletRequest request, String task, String page, String description, String remarks) {
        HttpSession session = request.getSession(false);
        Users sysUser = (Users) session.getAttribute(SessionVarlist.SYSTEMUSER);
        Audittrace audit = null;
        if (sysUser != null) {
            audit = new Audittrace();
            audit.setDescription(description);
            audit.setIp(request.getRemoteAddr());
            audit.setPagecode(page);
            audit.setTaskcode(task);
            audit.setRemarks(remarks);
            audit.setLastupdateduser(sysUser.getUsername());
        }
        return audit;
    }

    public static Audittrace makeAudittrace(HttpServletRequest request, Users user, String task, String page, String description, String remarks) {
        Audittrace audit = null;
        if (user != null && !(user.getUsername().trim().equals(CommonVarList.SYSTEMUSERNAME.trim()))) {
            audit = new Audittrace();
            audit.setDescription(description);
            audit.setIp(request.getRemoteAddr());
            audit.setPagecode(page);
            audit.setTaskcode(task);
            audit.setRemarks(remarks);
            audit.setLastupdateduser(user.getUsername());
        }
        return audit;
    }

    private static String convertToHex(byte[] data) {
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            int halfbyte = (data[i] >>> 4) & 0x0F;
            int two_halfs = 0;
            do {
                if ((0 <= halfbyte) && (halfbyte <= 9)) {
                    buf.append((char) ('0' + halfbyte));
                } else {
                    buf.append((char) ('a' + (halfbyte - 10)));
                }
                halfbyte = data[i] & 0x0F;
            } while (two_halfs++ < 1);
        }
        return buf.toString();
    }

    public static String makeHash(String input) throws Exception {
        try {
            Provider p = new org.bouncycastle.jce.provider.BouncyCastleProvider();
            Security.addProvider(p);
            MessageDigest msd = MessageDigest.getInstance("SHA-1", p);
            byte d[] = msd.digest(input.getBytes());
            return convertToHex(d);
        } catch (Exception e) {
            return null;
        }
    }

    public static ByteArrayOutputStream zipFiles(File[] listFiles) throws Exception {
        byte[] buffer;
        ByteArrayOutputStream outputStream = null;
        ZipOutputStream zipOutputStream = null;
        FileInputStream fileInputStream = null;
        try {
            outputStream = new ByteArrayOutputStream();
            zipOutputStream = new ZipOutputStream(outputStream);
            for (File file : listFiles) {
                buffer = new byte[(int) file.length()];
                fileInputStream = new FileInputStream(file);
                fileInputStream.read(buffer, 0, (int) file.length());
                ZipEntry ze = new ZipEntry(file.getName());

                zipOutputStream.putNextEntry(ze);
                zipOutputStream.write(buffer);
                zipOutputStream.closeEntry();
                fileInputStream.close();
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (zipOutputStream != null) {
                zipOutputStream.finish();
                zipOutputStream.close();
            }
            if (outputStream != null) {
                outputStream.flush();
                outputStream.close();
            }
        }
        return outputStream;
    }

    public static String zerofill(String str, int explength) {
        StringBuilder sb = new StringBuilder();
        for (int toPrepend = explength - str.trim().length(); toPrepend > 0; toPrepend--) {
            sb.append('0');
        }
        sb.append(str.trim());
        str = sb.toString();
        return str;
    }

    public static Date getStartingTimeofDay(Date date) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date);
        cal1.set(Calendar.HOUR_OF_DAY, 0);
        cal1.set(Calendar.MINUTE, 0);
        cal1.set(Calendar.SECOND, 0);
        cal1.set(Calendar.MILLISECOND, 0);
        date = cal1.getTime();
        return date;
    }

    public static Date getEndingTimeofDay(Date date) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date);
        cal1.set(Calendar.HOUR_OF_DAY, 24);
        cal1.set(Calendar.MINUTE, 0);
        cal1.set(Calendar.SECOND, 0);
        cal1.set(Calendar.MILLISECOND, 0);
        date = cal1.getTime();
        return date;
    }

    //checks and sets string to grid values
    public static String replaceNullOrEmptyDecimal(String input) {
        String result = CommonVarList.EMPTY_OR_NULL_REPLACE_VALUE;
        if (input != null && !input.isEmpty() && !input.trim().equalsIgnoreCase("null")) {
            result = Common.formatStringtoCurrency(input);
        }
        return result;
    }

    public static String replaceEmptyorNullObjectString(Object object) {
        String value = CommonVarList.EMPTY_OR_NULL_REPLACE_VALUE;
        if (object != null && !(object.toString()).trim().isEmpty()) {
            value = object.toString();
        }
        return value;
    }

    public static String replaceEmptyorNullStringToNA(String string) {
        String value = CommonVarList.EMPTY_OR_NULL_REPLACE_VALUE_NA;
        if (string != null && !string.trim().isEmpty()) {
            value = string;
        }
        return value;
    }

    /**
     * gets String value as a parameter and return related String value. If
     * String is 'null' or empty then it returns String "All" value.
     *
     * @param string
     * @return String
     */
    public static String replaceEmptyorNullStringToAll(String string) {
        String value = CommonVarList.EMPTY_OR_NULL_REPLACE_VALUE_ALL;
        if (string != null && !string.trim().isEmpty()) {
            value = string;
        }
        return value;
    }
    
    /**
     * return String value if parameter contain null or empty then it returns 0
     * else it return the value contain in the parameter.
     *
     * @param value
     * @return String
     */
    public static String replaceEmtyorNullToZero(String value) {
        String returnValue = "0";
        if (value != null && !value.trim().isEmpty()) {
            returnValue = value;
        }
        return returnValue;
    }
}
