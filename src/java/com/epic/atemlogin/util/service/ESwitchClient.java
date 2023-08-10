/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.atemlogin.util.service;

import com.epic.atemlogin.util.varlist.CommonVarList;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Logger;
import org.jpos.iso.ISOUtil;

/**
 *
 * Document : ESwitchClient Created on : Sep 29, 2017, 9:51:35 AM Author :
 * Darshana Thennakoon
 *
 */
public class ESwitchClient {

    public static String createHeader(String txnType) {
        String commonHeader = "";
        try {

            String messageFormatVersion = "001"; // 3 digits
            String incommingChannelMode = "01";  // mobile banking(01) - 2 digits
            String transactionType = txnType;  // User inquiry(98) - 2 digits
            String tid = "00000000";   // 8 digits
            String mid = "000000000000000";  //  15 digits
            String uniqueNumber = "000011"; // 6 digits
            String txnDateTime = "20170907125001";  // 14 digits
            String txnMode = "01";  // 2 digits
            String privateData = "webuser|000000000000"; // 20 digits
            String sid = "78B53B21EC26495DAC73F46E8EFAEDBF";  //  32 digits

            //0010198000000000000000000000000000112017090712500101webuser|00000000000078B53B21EC26495DAC73F46E8EFAEDBF
            commonHeader = messageFormatVersion
                    + incommingChannelMode
                    + transactionType
                    + tid
                    + mid
                    + uniqueNumber
                    + txnDateTime
                    + txnMode
                    + privateData
                    + sid;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return commonHeader;
    }

    public static String getResponse(String request, String ip, String port) throws Exception {

        Socket client = null;
        String response = null;
        DataOutputStream dataout = null;
        DataInputStream datain = null;

        final String SERVER_IP;
        final int SERVER_PORT;
        final int SERVER_TIMEOUT;

        try {

            int timeout = 0;

            timeout = Integer.parseInt(CommonVarList.ESWITCH_TIMEOUT);

            System.out.println("Switch Ip :" + ip);
            System.out.println("Switch Port :" + port);

            SERVER_IP = ip;
            SERVER_PORT = Integer.parseInt(port);
            SERVER_TIMEOUT = timeout;

            InetAddress anetAdd = InetAddress.getByName(SERVER_IP);
            InetSocketAddress sockAddress = new InetSocketAddress(anetAdd, SERVER_PORT);
            client = new Socket();
            client.setKeepAlive(true);
            client.connect(sockAddress, SERVER_TIMEOUT);

            client.setSoTimeout(SERVER_TIMEOUT);

            dataout = new DataOutputStream(client.getOutputStream());
            datain = new DataInputStream(client.getInputStream());

            byte[] requestByte = request.getBytes();
            int buffer_length = requestByte.length;
            byte[] MH = ISOUtil.hex2byte(ISOUtil.zeropad(Integer.toHexString(buffer_length), 8));

            dataout.write(ISOUtil.concat(MH, requestByte));
            dataout.flush();

            int HD_LEN = 0;
            byte[] HD = new byte[4];
            datain.readFully(HD, 0, HD.length);
            HD_LEN = Integer.parseInt(ISOUtil.hexString(HD), 16);

            byte BUFF[] = new byte[HD_LEN];

            if (HD_LEN > 0) {
                datain.readFully(BUFF, 0, HD_LEN);
                response = new String(BUFF);
            }

        } catch (SocketTimeoutException ste) {
            response = CommonVarList.ESWITCH_SOCKET_TIMEOUT;
            throw ste;
        } catch (Exception e) {
            response = CommonVarList.ESWITCH_SOCKET_TIMEOUT;
            response = "";
            throw e;
        } finally {
            try {
                if (client != null) {
                    client.close();
                }
                if (dataout != null) {
                    dataout.close();
                }
                if (datain != null) {
                    datain.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return response;
    }

    private static int N = 0;

    public static synchronized String getTraceNo() throws Exception {
        if (N == 999999) {
            N = 0;
        } else {
            ++N;
        }
        return ISOUtil.zeropad(Integer.toString(N), 6);
    }

    public static String getSwitchStatus(String URL, String PORT, String HEADER) {
        String status = CommonVarList.EPIC_SWITCH_STATUS_OFFLINE;
        Socket epicSWSocket = null;
        String response = null;
        DataInputStream datain = null;
        DataOutputStream dataout = null;
        try {
            InetAddress anetAdd = InetAddress.getByName(URL);
            InetSocketAddress sockAddress = new InetSocketAddress(anetAdd, Integer.valueOf(PORT));
            epicSWSocket = new Socket();
            epicSWSocket.setKeepAlive(true);
            epicSWSocket.connect(sockAddress, 5000);
            epicSWSocket.setSoTimeout(5000);

            dataout = new DataOutputStream(epicSWSocket.getOutputStream());
            datain = new DataInputStream(epicSWSocket.getInputStream());

            System.out.println("Server connected....");

            String hexLength = Integer.toHexString(HEADER.length());
            System.out.println("Hex length :" + hexLength);

            String requestPacket = String.format("%08d", Integer.parseInt(hexLength)) + HEADER;
            System.out.println("Server Reqeust Packet :" + requestPacket);

            String req = requestPacket.substring(8);
            System.out.println("Server Reqeust : " + req);

            byte[] request = req.getBytes();
            int buffer_length = request.length;
            byte[] MH = ISOUtil.hex2byte(ISOUtil.zeropad(Integer.toHexString(buffer_length), 8));

            dataout.write(ISOUtil.concat(MH, request));
            dataout.flush();

            int HD_LEN = 0;
            byte[] HD = new byte[4];
            datain.readFully(HD, 0, HD.length);
            HD_LEN = Integer.parseInt(ISOUtil.hexString(HD), 16);
            System.out.println("Server Response header lenth : " + HD_LEN);

            byte BUFF[] = new byte[HD_LEN];

            if (HD_LEN > 0) {
                datain.readFully(BUFF, 0, HD_LEN);
            }

            System.out.println("Server Response : \n" + ISOUtil.hexString(HD) + (new String(BUFF)));
            response = ISOUtil.hexString(HD) + (new String(BUFF));

            String[] responseData = response.split("\\^");

            try {
                if (responseData[1].equalsIgnoreCase("000")) {
                    status = CommonVarList.EPIC_SWITCH_STATUS_ONLINE;
                }
            } catch (Exception ex) {

            }
        } catch (Exception e) {
        } finally {
            try {
                if (epicSWSocket != null) {
                    epicSWSocket.close();
                }
                if (datain != null) {
                    datain.close();
                }
                if (dataout != null) {
                    dataout.close();
                }
            } catch (Exception e) {
            }
        }

        return status;
    }

}
