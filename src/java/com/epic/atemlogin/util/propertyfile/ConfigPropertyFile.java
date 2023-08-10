/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.atemlogin.util.propertyfile;

import com.epic.atemlogin.util.varlist.CommonVarList;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Base64;
import java.util.Properties;
import javax.servlet.ServletContextEvent;
import org.apache.commons.lang3.SystemUtils;

/**
 *
 * Document : ConfigPropertyFile Created on : Oct 26, 2017, 8:50:30 AM Author :
 * Darshana Thennakoon
 *
 */
public class ConfigPropertyFile {

    public void initialize(ServletContextEvent servletContextEvent) throws Exception {
        try {
            String propertyFilePath = servletContextEvent.getServletContext().getInitParameter("propfilepath");
            InputStream propertyfile = new FileInputStream(propertyFilePath);
            Properties propfile = new Properties();
            propfile.load(propertyfile);

            CommonVarList.ADMIN_URL = new String(Base64.getDecoder().decode(propfile.getProperty("adminurl")));
            CommonVarList.TMS_URL = new String(Base64.getDecoder().decode(propfile.getProperty("tmsurl")));
            CommonVarList.DB_CONFIG = propfile.getProperty("datasource");

        } catch (Exception e) {
            throw e;
        }
    }
}
