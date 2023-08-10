/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.atemlogin.dao.common;

import com.epic.atemlogin.util.common.HibernateInit;
import com.epic.atemlogin.util.mapping.Users;
import com.epic.atemlogin.util.varlist.CommonVarList;
import com.epic.atemlogin.util.varlist.MessageVarList;
import com.epic.atemlogin.util.varlist.SQLVarList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author darshana_t
 */
public class CommonDAO {

    //get system date from database
    public static Date getSystemDate(Session session) throws Exception {
        Date sysDateTime = null;
        try {
            String sql = "";
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            if (CommonVarList.DB_CONFIG.equals("mysql")) {
                sql = SQLVarList.MYSQL_GET_SYSTIME_SQL;
            } else if (CommonVarList.DB_CONFIG.equals("mssql")) {
                sql = SQLVarList.MSSQL_GET_SYSTIME_SQL;
            } else if (CommonVarList.DB_CONFIG.equals("oracle")) {
                sql = SQLVarList.ORACLE_GET_SYSTIME_SQL;
            }
            Query query = session.createSQLQuery(sql);
            if (query.list() != null && query.list().size() > 0) {
                String stime = (String) query.list().get(0);
                sysDateTime = dateFormat.parse(stime);
            } else {
                sysDateTime = new Date();
            }
        } catch (Exception e) {
            throw e;
        } finally {
        }
        return sysDateTime;
    }

    public String updateLoginFlasg(String username) throws Exception {
        Session session = null;
        Transaction txn = null;
        String message = "";
        try {
            session = HibernateInit.sessionFactory.openSession();
            Date sysDate = CommonDAO.getSystemDate(session);
            txn = session.beginTransaction();

            Users u = (Users) session.get(Users.class, username.trim());
            if (u != null) {
                u.setLoginflag(0);
                session.update(u);
                txn.commit();
            } else {
                message = MessageVarList.COMMON_LOGIN_FLAG;
            }
        } catch (Exception e) {
            if (txn != null) {
                txn.rollback();
            }
            throw e;
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return message;
    }

    public Users CheckLoginFlag(String username) throws Exception {
        Users users = new Users();
        Session session = null;
        try {
            session = HibernateInit.sessionFactory.openSession();
            users = (Users) session.get(Users.class, username);
        } catch (Exception e) {
            throw e;
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return users;
    }


}
