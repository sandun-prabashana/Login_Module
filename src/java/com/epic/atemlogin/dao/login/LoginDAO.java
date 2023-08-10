/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.atemlogin.dao.login;

import com.epic.atemlogin.bean.login.LoginBean;
import com.epic.atemlogin.dao.common.CommonDAO;
import com.epic.atemlogin.util.common.Common;
import com.epic.atemlogin.util.common.HibernateInit;
import com.epic.atemlogin.util.mapping.Audittrace;
import com.epic.atemlogin.util.mapping.Passwordparm;
import com.epic.atemlogin.util.mapping.Status;
import com.epic.atemlogin.util.mapping.Users;
import com.epic.atemlogin.util.varlist.CommonVarList;
import com.epic.atemlogin.util.varlist.SessionVarlist;
import java.util.Date;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * Document : LoginDAO Created on : 28/03/2013, 11:56:21 Author : Asitha Perera
 *
 */
public class LoginDAO {

    public Users findUserbyUsername(String username) throws Exception {
        Users user = null;
        Session session = null;
        try {
            session = HibernateInit.sessionFactory.openSession();
            if (!username.trim().equals(CommonVarList.SYSTEMUSERNAME)) {
                String sql = "from Users as u join fetch u.statusByPasswordstatus join fetch u.statusByStatus where u.username =:username";
                Query query = session.createQuery(sql).setString("username", username);
                user = (Users) query.list().get(0);
            } else {
                user = new Users();
                user.setUsername(username);
                Status sp = (Status) session.get(Status.class, CommonVarList.STATUS_CHANGED);
                Status ss = (Status) session.get(Status.class, CommonVarList.STATUS_ACTIVE);
                user.setStatusByPasswordstatus(sp);
                user.setStatusByStatus(ss);
            }
            CommonVarList.SYSUSER = username;
        } catch (IndexOutOfBoundsException ibe) {
            user = null;
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                if (session != null) {

                    session.close();
                }
            } catch (Exception e) {
                throw e;
            }
        }

        return user;
    }

    public int getPassparamcount(String paramcode) throws Exception {
        int count = 0;
        Session session = null;
        try {
            session = HibernateInit.sessionFactory.openSession();

            String sql = "from Passwordparm as p where p.paramcode =:paramcode";
            Query query = session.createQuery(sql).setString("paramcode", paramcode);
            Passwordparm passwordparm = (Passwordparm) query.list().get(0);
            if (passwordparm != null) {
                if (passwordparm.getValue() != null) {
                    count = Integer.parseInt(passwordparm.getValue().trim());
                } else {
                    count = 0;
                }
            }
        } catch (IndexOutOfBoundsException ibe) {
            count = 0;
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                if (session != null) {

                    session.close();
                }
            } catch (Exception e) {
                throw e;
            }
        }
        return count;
    }

    public boolean setUserPasswordStatus(Users user, Audittrace audit, String statuscode) throws Exception {
        Session session = null;
        Transaction txn = null;
        boolean status = true;
        try {
            session = HibernateInit.sessionFactory.openSession();
            txn = session.beginTransaction();
            if (user != null) {
                String before = getUserString(user);
                Date sysDate = CommonDAO.getSystemDate(session);
                Status s = (Status) session.get(Status.class, statuscode);
                user.setStatusByPasswordstatus(s);
                user.setLastupdatedtime(sysDate);

                String after = getUserString(user);
//                if (audit != null) {
//                    audit.setOldvalue(before);
//                    audit.setNewvalue(after);
//                    audit.setAffectedkey(user.getUsername());
//                    audit.setCreatedtime(sysDate);
//                    audit.setLastupdatedtime(sysDate);
//                    session.save(audit);
//                }
                session.update(user);

                txn.commit();
            } else {
                status = false;
            }
        } catch (Exception e) {
            if (txn != null) {
                txn.rollback();
            }
            throw e;
        } finally {
            try {
                if (session != null) {
                    session.close();
                }
            } catch (Exception e) {
                throw e;
            }
        }
        return status;
    }

    public boolean updateUser(LoginBean inputBean, Audittrace audit, boolean login) throws Exception {
        Session session = null;
        Transaction txn = null;
        boolean status = true;
        try {
            session = HibernateInit.sessionFactory.openSession();
            txn = session.beginTransaction();
            Date sysDate = CommonDAO.getSystemDate(session);

            Users u = (Users) session.get(Users.class, inputBean.getUsername().trim());
            if (u != null) {
                u.setAttempts(inputBean.getAttempts());
                if (login) {
                    u.setLastloggeddate(sysDate);//set last logged date only in successfull login
                    u.setLoginflag(CommonVarList.LOG_IN);
                } else {
                    u.setLoginflag(CommonVarList.LOG_OFF);
                }
                Status s = (Status) session.get(Status.class, inputBean.getStatus());
                u.setStatusByStatus(s);
                u.setLastupdatedtime(sysDate);
//                if (audit != null) {
//                    audit.setAffectedkey(u.getUsername());
//                    audit.setCreatedtime(sysDate);
//                    audit.setLastupdatedtime(sysDate);
//                    session.save(audit);
//                }
                session.update(u);

                txn.commit();
            } else {
                status = false;
            }
        } catch (Exception e) {
            if (txn != null) {
                txn.rollback();
            }
            throw e;
        } finally {
            try {
                if (session != null) {

                    session.close();
                }
            } catch (Exception e) {
                throw e;
            }
        }
        return status;
    }

    public Date getCurrtime() throws Exception {
        Date currdate = null;
        Session session = null;
        try {
            session = HibernateInit.sessionFactory.openSession();
            currdate = CommonDAO.getSystemDate(session);
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                session.close();
            } catch (Exception e) {
                throw e;
            }
        }
        return currdate;
    }

    //set section string
    private String getUserString(Users usr) {
        String oString = "";
        if (usr.getUsername() != null) {
            oString = usr.getUsername();
        } else {
            oString = "Error";
            return oString;
        }
        oString = oString + "|";
        if (usr.getEmployeeid() != null) {
            oString = oString + usr.getEmployeeid();
        } else {
            oString = oString + "--";
        }
        oString = oString + "|";
        if (usr.getFullname() != null) {
            oString = oString + usr.getFullname();
        } else {
            oString = oString + "--";
        }
        oString = oString + "|";
        if (usr.getStatusByStatus().getDescription() != null) {
            oString = oString + usr.getStatusByStatus().getDescription();
        } else {
            oString = oString + "--";
        }
        oString = oString + "|";
        if (usr.getStatusByPasswordstatus().getDescription() != null) {
            oString = oString + usr.getStatusByPasswordstatus().getDescription();
        } else {
            oString = oString + "--";
        }
        oString = oString + "|";
        if (usr.getLastupdateduser() != null) {
            oString = oString + usr.getLastupdateduser();
        } else {
            oString = oString + "--";
        }
        oString = oString + "|";
        if (usr.getCreatedtime() != null) {
            oString = oString + Common.formatDatetoString(usr.getCreatedtime());
        } else {
            oString = oString + "--";
        }
        oString = oString + "|";
        if (usr.getLastupdatedtime() != null) {
            oString = oString + Common.formatDatetoString(usr.getLastupdatedtime());
        } else {
            oString = oString + "--";
        }
        return oString;
    }

    public void saveLogoutAudit(String username, Audittrace audit, boolean b) throws Exception {
        Session session = null;
        Transaction txn = null;
        try {
            session = HibernateInit.sessionFactory.openSession();
            txn = session.beginTransaction();
            Date sysDate = CommonDAO.getSystemDate(session);
            if (username != null) {
                Users us = (Users) session.get(Users.class, username);
                us.setLoginflag(CommonVarList.LOG_OFF);
                session.update(us);
            }

//            if (audit != null) {
//                audit.setAffectedkey(u.getUsername());
//                audit.setCreatedtime(sysDate);
//                audit.setLastupdatedtime(sysDate);
//                session.save(audit);
//            }
            txn.commit();
        } catch (Exception e) {
            if (txn != null) {
                txn.rollback();
            }
            throw e;
        } finally {
            try {
                if (session != null) {

                    session.close();
                }
            } catch (Exception e) {
                throw e;
            }
        }
    }

}
