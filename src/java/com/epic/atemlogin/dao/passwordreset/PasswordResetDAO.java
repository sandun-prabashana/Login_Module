/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.atemlogin.dao.passwordreset;

import com.epic.atemlogin.bean.passwordreset.PasswordResetInputBean;
import com.epic.atemlogin.dao.common.CommonDAO;
import com.epic.atemlogin.util.common.Common;
import com.epic.atemlogin.util.common.HibernateInit;
import com.epic.atemlogin.util.mapping.Audittrace;
import com.epic.atemlogin.util.mapping.Passwordhistory;
import com.epic.atemlogin.util.mapping.Passwordparm;
import com.epic.atemlogin.util.mapping.Passwordpolicy;
import com.epic.atemlogin.util.mapping.Status;
import com.epic.atemlogin.util.mapping.Users;
import com.epic.atemlogin.util.varlist.CommonVarList;
import com.epic.atemlogin.util.varlist.MessageVarList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author darshana_t
 */
public class PasswordResetDAO {
    
    public Passwordpolicy getPasswordPolicy(String statuscode) throws Exception {
        Passwordpolicy passwordpolicy = null;
        Session session = null;
        try {
            session = HibernateInit.sessionFactory.openSession();

            String sql = "from Passwordpolicy as pp where pp.status.statuscode=:statuscode";// join fetch t.status
            Query query = session.createQuery(sql).setString("statuscode", statuscode);
            if (query.list() != null && query.list().size() > 0) {
                passwordpolicy = (Passwordpolicy) query.list().get(0);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                session.close();
            } catch (Exception e) {
                throw e;
            }
        }
        return passwordpolicy;
    }

    //password reset user 
    public String UpdatePasswordReset(PasswordResetInputBean inputBean, Audittrace audit, int days) throws Exception {
        Session session = null;
        Transaction txn = null;
        String message = "";
        try {
            session = HibernateInit.sessionFactory.openSession();
            txn = session.beginTransaction();
            Date sysDate = CommonDAO.getSystemDate(session);

            Users u = (Users) session.get(Users.class, inputBean.getHusername().trim());
            if (u != null) {
                String before = getUserString(u);

                Status status = (Status) session.get(Status.class, CommonVarList.STATUS_CHANGED);
                u.setPassword(inputBean.getRenewpwd());
                u.setStatusByPasswordstatus(status);

                Date expiredate = this.getexpireddate(days, sysDate);
                u.setExpirydate(expiredate);
                u.setLastupdateduser(Common.getCurrentUsername());
                u.setLastupdatedtime(sysDate);

                String after = getUserString(u);

                Passwordhistory passwordhistory = new Passwordhistory();
                passwordhistory.setUsername(u.getUsername());
                passwordhistory.setPassword(u.getPassword());
                passwordhistory.setCreatedtime(sysDate);
                passwordhistory.setLastupdateduser(Common.getCurrentUsername());
                passwordhistory.setLastupdatedtime(sysDate);
                if (audit != null) {
                    audit.setOldvalue(before);
                    audit.setNewvalue(after);
                    audit.setAffectedkey(u.getUsername());
                    audit.setCreatedtime(sysDate);
                    audit.setLastupdatedtime(sysDate);
                    session.save(audit);
                }
                session.update(u);
                session.save(passwordhistory);
                txn.commit();
            } else {
                message = MessageVarList.COMMON_NOT_EXISTS;
            }
        } catch (Exception e) {
            if (txn != null) {
                txn.rollback();
            }
            throw e;
        } finally {
            try {

                session.close();
            } catch (Exception e) {
                throw e;
            }
        }
        return message;
    }

    //find user by username
    public Users findUserById(String username) throws Exception {
        Users user = new Users();
        Session session = null;
        try {
            session = HibernateInit.sessionFactory.openSession();

            String sql = "from Users as u join fetch u.statusByStatus where u.username=:username";
            Query query = session.createQuery(sql).setString("username", username);
            user = (Users) query.list().get(0);

        } catch (Exception e) {
            throw e;
        } finally {
            try {

                session.close();
            } catch (Exception e) {
                throw e;
            }
        }
        return user;

    }

    public int getPasswordhistorycount() throws Exception {
        int count = 0;
        Session session = null;
        try {
            session = HibernateInit.sessionFactory.openSession();
            String sql = "from Passwordparm as p where p.paramcode =:paramcode";
            Query query = session.createQuery(sql).setString("paramcode", CommonVarList.PW_PARAM_PW_HIS_KEEP);
            Passwordparm passwordparm = (Passwordparm) query.list().get(0);
            if (passwordparm != null) {
                if (passwordparm.getValue() != null) {
                    count = Integer.parseInt(passwordparm.getValue().trim());
                }else{
                    count=0;
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

    public List<Passwordhistory> getPasswordHistoryList(int max, String username) throws Exception {
        List<Passwordhistory> dataList = new ArrayList<Passwordhistory>();
        Session session = null;
        try {
            session = HibernateInit.sessionFactory.openSession();
            String sqlSearch = "from Passwordhistory as ph where ph.username='" + username + "' order by ph.id desc";
            Query query = session.createQuery(sqlSearch);
            query.setMaxResults(max);
            dataList = (List<Passwordhistory>) query.list();
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                session.close();
            } catch (Exception e) {
                throw e;
            }
        }
        return dataList;
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
                }else{
                    count=0;
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
//        oString = oString + "|";
//        if (usr.get != null) {
//            oString = oString + usr.getUserrole().getDescription();
//        } else {
//            oString = oString + "--";
//        }
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

    private Date getexpireddate(int days, Date sysDate) throws Exception {
        Date exp = null;
        long unit = CommonVarList.TIMESTAMPVALUE_PERDAY;
        try {
            exp = new Date(unit * days + sysDate.getTime());
        } catch (Exception e) {
            throw e;
        }
        return exp;
    }
}
