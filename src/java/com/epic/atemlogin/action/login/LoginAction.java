/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.atemlogin.action.login;

import com.epic.atemlogin.bean.login.LoginBean;
import com.epic.atemlogin.dao.common.CommonDAO;
import com.epic.atemlogin.dao.login.LoginDAO;
import com.epic.atemlogin.util.common.Common;
import com.epic.atemlogin.util.mapping.Audittrace;
import com.epic.atemlogin.util.mapping.Users;
import com.epic.atemlogin.util.varlist.CommonVarList;
import com.epic.atemlogin.util.varlist.LogoutMsgVarList;
import com.epic.atemlogin.util.varlist.MessageVarList;
import com.epic.atemlogin.util.varlist.PageVarList;
import com.epic.atemlogin.util.varlist.SessionVarlist;
import com.epic.atemlogin.util.varlist.TaskVarList;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @Document : LoginAction
 * @Created on : 27/03/2013, 14:50:48
 * @Author : Asitha Perera
 *
 */
public class LoginAction extends ActionSupport implements ModelDriven<Object> {

    LoginBean inputBean = new LoginBean();
    Users sysUser = new Users();

    @Override
    public Object getModel() {
        return inputBean;
    }

    @Override
    public String execute() {
        System.out.println("called LoginAction : execute");
        return SUCCESS;
    }

    public String Check() {
        String result = "message";
        System.out.println("called LoginAction : check");
        try {
            HttpServletRequest request = ServletActionContext.getRequest();
            HttpSession session = request.getSession(true);
            CommonDAO commonDAO = new CommonDAO();
            if (session != null) {
                String message = this.validateUser();
                if (message.isEmpty()) {
                    inputBean.setParam(new String(Base64.getEncoder().encode(inputBean.getUsername().getBytes())));
                    System.out.println(inputBean.getParam());
                    inputBean.setUsertype(sysUser.getUsertype());
                    switch (inputBean.getUsertype()) {
                        case 1:
                            inputBean.setAdminurl(CommonVarList.ADMIN_URL != null && !CommonVarList.ADMIN_URL.isEmpty() ? CommonVarList.ADMIN_URL : "#");
                            inputBean.setTmsurl("#");
                            break;
                        case 2:
                            inputBean.setTmsurl(CommonVarList.TMS_URL != null && !CommonVarList.TMS_URL.isEmpty() ? CommonVarList.TMS_URL : "#");
                            inputBean.setAdminurl("#");
                            break;
                        case 3:
                            inputBean.setAdminurl(CommonVarList.ADMIN_URL != null && !CommonVarList.ADMIN_URL.isEmpty() ? CommonVarList.ADMIN_URL : "#");
                            inputBean.setTmsurl(CommonVarList.TMS_URL != null && !CommonVarList.TMS_URL.isEmpty() ? CommonVarList.TMS_URL : "#");
                            break;
                        default:
                            inputBean.setAdminurl("#");
                            inputBean.setTmsurl("#");
                            break;
                    }

                    //set user to the session                    
                    session.setAttribute(SessionVarlist.SYSTEMUSER, sysUser);
                    session.setAttribute(SessionVarlist.USERNAME, inputBean.getUsername());
                    session.setAttribute("cbkey", inputBean.getBrowserTabKey());
                    //set user and sessionid to hashmap              
                    ServletContext sc = ServletActionContext.getServletContext();
                    HashMap<String, String> userMap = (HashMap<String, String>) sc.getAttribute(SessionVarlist.USERMAP);
                    if (userMap == null) {
                        userMap = new HashMap<String, String>();
                    }
                    userMap.put(sysUser.getUsername(), session.getId());
                    sc.setAttribute(SessionVarlist.USERMAP, userMap);

                    String status = sysUser.getStatusByPasswordstatus().getStatuscode();
                    if (status.equalsIgnoreCase(CommonVarList.STATUS_RESET) || status.equalsIgnoreCase(CommonVarList.STATUS_NEW)) {
                        result = "resetpwd";
                        if (status.equalsIgnoreCase(CommonVarList.STATUS_NEW)) {
                            session.setAttribute(SessionVarlist.RESETPASSWORDMSG, MessageVarList.PASSWORDRESET_NEWUSER);
                        } else if (status.equalsIgnoreCase(CommonVarList.STATUS_RESET)) {
                            session.setAttribute(SessionVarlist.RESETPASSWORDMSG, MessageVarList.PASSWORDRESET_RESETUSER);
                        } else if (status.equalsIgnoreCase(CommonVarList.STATUS_CHANGED)) {
                            session.setAttribute(SessionVarlist.RESETPASSWORDMSG, MessageVarList.PASSWORDRESET_CHNGPWD);
                        } else if (status.equalsIgnoreCase(CommonVarList.STATUS_EXPIRED)) {
                            session.setAttribute(SessionVarlist.RESETPASSWORDMSG, MessageVarList.PASSWORDRESET_EXPPWD);
                        }

                    } else {
                        LoginDAO loginDao = new LoginDAO();
                        Date expiredate = sysUser.getExpirydate();
                        Date currtime = loginDao.getCurrtime();
                        if (expiredate != null && currtime != null && expiredate.getTime() <= currtime.getTime()) {
                            session.setAttribute(SessionVarlist.RESETPASSWORDMSG, MessageVarList.PASSWORDRESET_EXPPWD);
                            Audittrace audit = Common.makeAudittrace(request, TaskVarList.UPDATE_TASK, PageVarList.LOGIN_PAGE, "User updated", null);
                            loginDao.setUserPasswordStatus(sysUser, audit, CommonVarList.STATUS_EXPIRED);
                            result = "resetpwd";
                        } else {
                            result = SUCCESS;
                        }
                    }
                    session.setAttribute(SessionVarlist.VERSION, ServletActionContext.getServletContext().getInitParameter("appversion"));
                } else {
                    addActionError(message);
                    if (inputBean.getUsername() != null && !inputBean.getUsername().trim().isEmpty()) {
                        inputBean.setPassword("Password");
                    } else {
                        inputBean.setUsername("");
                        inputBean.setPassword("");
                    }
                }
                inputBean.setVersion(ServletActionContext.getServletContext().getInitParameter("appversion"));
            } else {
                inputBean.setPassword("Password");
                result = "loginpage";
            }
        } catch (Exception ex) {
            addActionError("Cannot Login. Please contact administrator.");
            Logger.getLogger(LoginAction.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }

    public String Logout() {
        String result = "message";
        System.out.println("called LoginAction : Logout");
        try {
            //invalidate session
            HttpServletRequest request = ServletActionContext.getRequest();
            HttpSession session = request.getSession(false);
            if (session != null) {
                //error messages

                CommonDAO commonDAO = new CommonDAO();
                System.out.println("User Name : "+CommonVarList.SYSUSER);
                commonDAO.updateLoginFlasg(CommonVarList.SYSUSER);

                if (inputBean.getMessage() != null && !inputBean.getMessage().isEmpty()) {
                    String message = inputBean.getMessage();
                    if (message.equals("error0")) {
                        addActionError("You are trying to use another tab. Access denied.");
                    } else if (message.equals("error1")) {
                        addActionError("Access denied. Please login again.");
                    } else if (message.equals("error2")) {
                        addActionError("You have been logged in from another machine. Access denied.");
                    } else if (message.equals("error3")) {
                        addActionError("User session timed out.Please login again.");
                    } else if (message.equals("success1")) {
                        addActionMessage("Your password changed successfully. Please login with the new password.");
                    }
                } else {//if loginbean not set check for the session message
                    String msg = String.valueOf(session.getAttribute("intercept"));
                    if (msg.equalsIgnoreCase("ERROR_ACCESS")) {
                        addActionError(LogoutMsgVarList.ERROR_ACCESS);
                    } else if (msg.equals("ERROR_ACCESSPOINT")) {
                        addActionError(LogoutMsgVarList.ERROR_ACCESSPOINT);
                    } else if (msg.equals("ERROR_USER_INFO")) {
                        addActionError(LogoutMsgVarList.ERROR_USER_INFO);
                    } else if (msg.equals("ERROR_SESSION")) {
                        addActionError(LogoutMsgVarList.ERROR_SESSION);
                    } else if (msg.equals("PASSWORD_CHANGE_SUCCESS")) {
                        addActionMessage(LogoutMsgVarList.PASSWORD_CHANGE_SUCCESS);
                    }
                }
                Users user = (Users) session.getAttribute(SessionVarlist.SYSTEMUSER);
                if (user != null) {
                    Audittrace audit = Common.makeAudittrace(request, user, TaskVarList.LOGOUT_TASK, "", "Logout", null);
                    new LoginDAO().saveLogoutAudit(session.getAttribute(SessionVarlist.USERNAME).toString(), audit, true);
                }
                session.invalidate();
            } else if (inputBean.getMessage() != null && !inputBean.getMessage().isEmpty()) {
                String message = inputBean.getMessage();
                if (message.equals("error3")) {
                    addActionError("User session timed out.Please login again.");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(LoginAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        inputBean.setVersion(ServletActionContext.getServletContext().getInitParameter("appversion"));
        return result;
    }

    private String validateUser() {
        String message = "";
        try {
            LoginDAO dao = new LoginDAO();
            HttpServletRequest request = ServletActionContext.getRequest();
            if (inputBean.getUsername() == null || inputBean.getUsername().isEmpty()) {
                message = MessageVarList.LOGIN_EMPTY_USERNAME;
            } else if (inputBean.getPassword() == null || inputBean.getPassword().isEmpty()) {
                message = MessageVarList.LOGIN_EMPTY_PASSWORD;
            } else {
                //check user validity from db
                sysUser = dao.findUserbyUsername(inputBean.getUsername());
                String hPass = inputBean.getPassword();
                if (sysUser == null) {
                    message = MessageVarList.LOGIN_INVALID;
                } else if (sysUser.getStatusByStatus().getStatuscode().equals(CommonVarList.STATUS_DEACTIVE)) {
                    message = MessageVarList.LOGIN_DEACTIVE;
                } else if (checkUserIncative(dao)) {
                    message = MessageVarList.LOGIN_IDLEDEACTIVE;
                    inputBean.setStatus(CommonVarList.STATUS_DEACTIVE);
                    Audittrace audit = Common.makeAudittrace(request, sysUser, TaskVarList.LOGIN_TASK, PageVarList.LOGIN_PAGE, "Login de-activated", null);
                    dao.updateUser(inputBean, audit, false);
                } else if (!hPass.equals(sysUser.getPassword())) {
                    if (sysUser.getAttempts() == null) {
                        sysUser.setAttempts(new Byte("0"));
                    }
                    byte attempts = sysUser.getAttempts().byteValue();
                    attempts++;
                    inputBean.setAttempts(attempts);
                    inputBean.setStatus(sysUser.getStatusByStatus().getStatuscode());
                    Audittrace audit = Common.makeAudittrace(request, sysUser, TaskVarList.LOGIN_TASK, PageVarList.LOGIN_PAGE, "Login attempt " + attempts, null);
                    message = MessageVarList.LOGIN_INVALID;

                    if (sysUser.getAttempts() >= dao.getPassparamcount(CommonVarList.PW_PARAM_PIN_COUNT)) {
                        inputBean.setAttempts(sysUser.getAttempts());
                        inputBean.setStatus(CommonVarList.STATUS_DEACTIVE);
                        audit = Common.makeAudittrace(request, sysUser, TaskVarList.LOGIN_TASK, PageVarList.LOGIN_PAGE, "Login de-activated", null);
                        message = MessageVarList.LOGIN_DEACTIVE;
                    }
                    dao.updateUser(inputBean, audit, false);
                } else if (message.isEmpty()) {
                    inputBean.setAttempts(new Byte("0"));
                    inputBean.setStatus(sysUser.getStatusByStatus().getStatuscode());
                    Audittrace audit = Common.makeAudittrace(request, sysUser, TaskVarList.LOGIN_TASK, PageVarList.LOGIN_PAGE, "Login successfully", null);
                    CommonDAO commonDAO = new CommonDAO();
                    Users users = commonDAO.CheckLoginFlag(inputBean.getUsername());
                    if (users.getLoginflag().equals(0)) {
                        dao.updateUser(inputBean, audit, true);
                    } else {
                        message = ("Another session with this user account is currently active. Please log out of the other session or contact support if you believe this is an error");

                    }
                }
            }
        } catch (Exception ex) {
            message = MessageVarList.LOGIN_ERROR_LOAD;
            Logger.getLogger(LoginAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return message;
    }

    private boolean checkUserIncative(LoginDAO dao) throws Exception {
        boolean status = false;
        Date systime = dao.getCurrtime();
        int maxinactdays = dao.getPassparamcount(CommonVarList.PW_PARAM_IACT_TIME_PERIOD);
        if (maxinactdays == 0) {
            maxinactdays = CommonVarList.PWPARM_DEF_INACTTIME;
        }
        long maxinactime = maxinactdays * CommonVarList.TIMESTAMPVALUE_PERDAY;
        if (systime != null && sysUser.getLastloggeddate() != null && maxinactdays > 0) {
            long currincativetime = systime.getTime() - sysUser.getLastloggeddate().getTime();
            if (currincativetime >= maxinactime) {
                status = true;
            }
        }
        return status;
    }
}
