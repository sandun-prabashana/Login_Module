/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.atemlogin.util.listener;

import com.epic.atemlogin.util.common.HibernateInit;
import com.epic.atemlogin.util.propertyfile.ConfigPropertyFile;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * Document : ContextListener Created on : 28/03/2013, 12:27:41 Author : Asitha
 * Perera
 *
 */
public class ContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            HibernateInit hi = new HibernateInit();
            hi.initialize();
            System.out.println("New Session Factory Initialized.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ConfigPropertyFile configPropFile = new ConfigPropertyFile();
            configPropFile.initialize(sce);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try {
            HibernateInit.sessionFactory.close();
            System.out.println("Session Factory Destroyed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
