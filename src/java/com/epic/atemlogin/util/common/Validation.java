/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.atemlogin.util.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author nimantha
 */
public class Validation {

    /**
     * check given value is a PhoneNumber value
     *
     * @param val
     * @return
     */
    public static boolean isValidPhoneNumber(String val) {
        boolean status = true;
        try {
            int mode = 0;//1 plus 2 zero
            for (int i = 0; i < val.length(); i++) {
                char c = val.charAt(i);
                if (i == 0) {
                    if (c == '+') {
                        mode = 1;
                    } else if (c == '0') {
                        mode = 2;
                    } else {
                        status = false;
                    }
                } else if (!(c >= '0' && c <= '9')) {
                    status = false;
                }
            }
            if (status) {
                if (mode == 1 && val.length() != 12) {
                    status = false;
                } else if (mode == 2 && val.length() != 10) {
                    status = false;
                }
            }
        } catch (Exception e) {
            status = false;
        }
        return status;
    }

    /**
     *
     */
    public static boolean isValidNICNumber(String val) {
        boolean status = true;
        try {
            int mode = 0;//1 plus 2 zero
            for (int i = 0; i < val.length(); i++) {
                char c = val.charAt(i);
                if (i != 9) {
                    if ((c >= '0') && (c <= '9')) {
                        status = true;
                    } else {
                        status = false;
                        break;
                    }
                }
                if (i == 9) {
                    if (c == 'V' || c == 'v' || c == 'X' || c == 'x') {
                        mode = 1;
                    } else {
                        status = false;
                    }
                }
            }
            if (status) {
                if (mode == 1 && val.length() != 10) {
                    status = false;
                } else if (mode == 0 && val.length() != 10) {
                    status = false;
                }
            }
        } catch (Exception e) {
            status = false;
        }
        return status;
    }

    /**
     * check given value is a percentage value
     *
     * @param val
     * @return
     */
    public static boolean isPercentageValue(String val) {
        boolean status;
        int numOfDPoints = 2;
        try {
            String valArray[] = val.split("\\.");
            if (valArray.length < 3) {
                if (valArray[0].length() > 0 && (valArray.length == 2 && valArray[1].length() == numOfDPoints)) {
                    if (isNumeric(valArray[0]) && isNumeric(valArray[1])) {
                        status = true;
                    } else {
                        status = false;
                    }
                } else {
                    status = false;
                }
            } else {
                status = false;
            }
        } catch (Exception e) {
            status = false;
        }
        return status;
    }

    /**
     * check give value is a currency value
     *
     * @param val
     * @return
     */
    public static boolean isCurrencyValue(String val) {
        boolean status;
        int numOfDPoints = 2;
        try {
            String valArray[] = val.split("\\.");
            if (valArray.length == 2) {
                if (valArray[1].length() == numOfDPoints) {
                    if (isNumeric(valArray[0]) && isNumeric(valArray[1])) {
                        status = true;
                    } else {
                        status = false;
                    }
                } else {
                    status = false;
                }
            } else {
                status = false;
            }
        } catch (Exception e) {
            status = false;
        }
        return status;

    }

    /**
     * check give value is a string of special characters
     *
     * @param val
     * @return
     */
//    public static boolean is12HourTimeString(String str) {
//        try {
//            boolean isValid = true;
//            String regex = "[0-1][0-2].[0-5][0-9]";
//            Pattern pattern = Pattern.compile(regex);
//            Matcher matcher = pattern.matcher(str);
//            if (!matcher.matches()) {
//                isValid = false;
//            }
//            return isValid;
//        } catch (Exception e) {
//            return true;
//        }
//    }
    
    public static boolean is12HourTimeString(String str) {
        try {
            boolean isValid = true;
            String regex = "(1[012]|0[1-9]).[0-5][0-9]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);
            if (!matcher.matches()) {
                isValid = false;
            }
            return isValid;
        } catch (Exception e) {
            return true;
        }
    }

    /**
     * check give value is a string of special characters
     *
     * @param val
     * @return
     */
    public static boolean isSpecailString(String val) {
        try {
            boolean isValid = true;
            String regex = "\\W+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(val);
            if (!matcher.matches()) {
                isValid = false;
            }
            if (isValid) {
                String newStr = new String();
                for (int i = 0; i < val.length(); i++) {
                    char c = val.charAt(i);
                    if (newStr.indexOf(c) == -1) {
                        StringBuffer sb = new StringBuffer();
                        sb.append(c);
                        newStr += sb.toString();
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }
            return isValid;
        } catch (Exception e) {
            return true;
        }
    }

    /**
     * check give value has special characters
     *
     * @param val
     * @return
     */
    public static boolean isSpecailCharacter(String val) {
        try {
            boolean isValid = true;

            for (int i = 0; i < val.length(); i++) {
                char c = val.charAt(i);

                if ((c == '"') || (c == ';') || (c == ',') || (c == '@') || (c == '|') || (c == '*') || (c == '#') || (c == '{') || (c == '}') || (c == '`') || (c == '?')
                        || (c == '!') || (c == '$') || (c == '%') || (c == '^') || (c == '&') || (c == '/') || (c == '>') || (c == '<') || (c == '(') || (c == ')') || (c == '~') || (c == '\'')) {
                    isValid = false;
                }
            }
            return isValid;
        } catch (Exception e) {
            return true;
        }
    }

    public static boolean isValidEmail(String theInputString) {

        boolean isValid = true;

        //Set the email pattern string
        Pattern p = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");

        //Match the given string with the pattern
        Matcher m = p.matcher(theInputString);

        //Check whether match is found
        boolean matchFound = m.matches();

        if (!matchFound) {
            isValid = false;
        }

        return isValid;
    }
    //if correct numerc value found, then return true

    public static boolean isNumeric(String theInputString) {

        boolean isValid = false;

        for (int i = 0; i < theInputString.length(); i++) {
            char c = theInputString.charAt(i);
            if ((c >= '0') && (c <= '9')) {
                isValid = true;
            } else {
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    public static boolean getIntInRange(String quantity) {

        int range = 0;
        boolean isValid = false;

        range = Integer.parseInt(quantity);

        if (range >= 01 && range <= 12) {
             isValid = true;
        } else {
            isValid = false;
        }

        return isValid;

    }

    public static Boolean isNumericDouble(String val) {
        try {
            if (isDecimalNumeric(val)) {
                return true;
            } else if (isNumeric(val)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isString(String value) {
        boolean valied = true;
        try {
            if (!value.matches("[a-zA-Z]*")) {
                valied = false;
            }
        } catch (Exception e) {
            valied = false;
        }
        return valied;
    }

    public static boolean isAlphaNumeric(String value) {
        boolean valid = true;

        try {
            if (!value.matches("[a-zA-Z0-9]*")) {
                valid = false;
            }

        } catch (Exception ex) {
            valid = false;
        }

        return valid;
    }
    private static final String DECIMALNUMERIC_PATTERN = "\\d{0,15}\\.\\d{0,2}";

    public static boolean isDecimalNumeric(String inputString) {
        boolean validFlag = false;
        Pattern p = Pattern.compile(DECIMALNUMERIC_PATTERN);
        Matcher m = p.matcher(inputString.trim());
        if (m.matches()) {
            validFlag = true;
        }
        return validFlag;
    }

    public static boolean validate94PhoneNumber(String mobileNo) {
        boolean Valid94number = true;
        if (mobileNo.length() != 11) {
            Valid94number = false;
        } else {
            if (mobileNo.charAt(0) != '9' && mobileNo.charAt(1) != '4') {
                Valid94number = false;
            } else {
                for (int i = 0; i < mobileNo.length(); i++) {
                    char c = mobileNo.charAt(i);
                    if (!Character.isDigit(c)) {
                        Valid94number = false;
                        break;
                    }
                }
            }
        }
        return Valid94number;
    }

    public static boolean validateCommonPhoneNumber(String mobileNo) {
        boolean validmobnumber = true;
        if (mobileNo.length() != 10) {
            validmobnumber = false;
        } else {
            for (int i = 0; i < mobileNo.length(); i++) {
                char c = mobileNo.charAt(i);
                if (!Character.isDigit(c)) {
                    validmobnumber = false;
                    break;
                }
            }
        }
        return validmobnumber;
    }
    
    public static String checkEmptyorNullString(String str) {
        if (str == null || str.isEmpty()) {
            str = "--";
        }
        return str;
    }
}
