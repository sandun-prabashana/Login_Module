/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.atemlogin.util.common;

import com.epic.atemlogin.util.varlist.CommonVarList;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @Document : HibernateInit
 * @Created on : 28/03/2013, 12:22:40
 * @Author : Asitha Perera
 *
 */
public class HibernateInit {

    public static SessionFactory sessionFactory;

   public SessionFactory initialize() {
        //            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); //for hibernate 3.0
        if (sessionFactory == null || sessionFactory.isClosed()) {
            Configuration configuration = new Configuration();
            configuration.configure();
            CommonVarList.JNDINAME=configuration.getProperty("hibernate.connection.datasource");
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            // Create the SessionFactory from hibernate.cfg.xml
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            
        }
        return sessionFactory;
    }
}
