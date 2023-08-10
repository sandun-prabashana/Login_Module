/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.atemlogin.action.passwordreset;

import com.epic.atemlogin.bean.passwordreset.PasswordResetInputBean;
import com.epic.atemlogin.dao.passwordreset.PasswordResetDAO;
import com.epic.atemlogin.util.common.AccessControlService;
import com.epic.atemlogin.util.common.Common;
import com.epic.atemlogin.util.mapping.Audittrace;
import com.epic.atemlogin.util.mapping.Passwordhistory;
import com.epic.atemlogin.util.mapping.Passwordpolicy;
import com.epic.atemlogin.util.mapping.Users;
import com.epic.atemlogin.util.varlist.CommonVarList;
import com.epic.atemlogin.util.varlist.MessageVarList;
import com.epic.atemlogin.util.varlist.PageVarList;
import com.epic.atemlogin.util.varlist.SessionVarlist;
import com.epic.atemlogin.util.varlist.TaskVarList;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import org.hibernate.HibernateException;

/**
 *
 * @author darshana_t
 */
public class PasswordResetAction extends ActionSupport implements ModelDriven<Object>, AccessControlService {

    private PasswordResetInputBean inputBean = new PasswordResetInputBean();

    @Override
    public String execute() {
        System.out.println("called PasswordResetAction :execute");
        return SUCCESS;
    }

    //view server operating houts
    public String View() {
        System.out.println("called PasswordResetAction :View");
        String retType = "view";
        try {
            try {
                if (this.applyUserPrivileges()) {
                    HttpServletRequest request = ServletActionContext.getRequest();
                    HttpSession session = request.getSession(false);
                    Users user = (Users) session.getAttribute(SessionVarlist.SYSTEMUSER);
                    if (!user.getUsername().trim().equals(CommonVarList.SYSTEMUSERNAME.trim())) {
                        inputBean.setUsername(user.getUsername());
                        inputBean.setHusername(user.getUsername());
                        inputBean.setEmployeeid(user.getEmployeeid());
//                        inputBean.setUserrole(user.getUserrole().getDescription());
                        Object msgObj = session.getAttribute(SessionVarlist.RESETPASSWORDMSG);
                        String msg = String.valueOf(msgObj);
                        if (msgObj != null && !msg.isEmpty()) {
                            addActionMessage(msg);
                        } else {
                            addActionMessage(MessageVarList.PASSWORDRESET_CHNGPWD);
                        }
                    } else {
                        addActionError(MessageVarList.SYSTEMUSER_CHNPWD_NOTALLOWED);
                    }
                } else {
                    retType = "loginpage";
                }
            } catch (HibernateException ex) {
                addActionError(MessageVarList.COMMON_ERROR_GET_DATA);
                Logger.getLogger(PasswordResetAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            addActionError(MessageVarList.COMMON_ERROR_PROCESS + " passsword reset");
            Logger.getLogger(PasswordResetAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retType;
    }

    //update password
    public String Edit() {
        System.out.println("called PasswordResetAction :Edit");
        String retType = "message";
        PasswordResetDAO dao = new PasswordResetDAO();
        try {
            try {
                HttpServletRequest request = ServletActionContext.getRequest();
                HttpSession session = request.getSession(false);
                Users user = (Users) session.getAttribute(SessionVarlist.SYSTEMUSER);
                String message = this.validateInputs();
                if (message.isEmpty()) {
                    Users users = dao.findUserById(inputBean.getHusername());
                    if (users.getPassword().trim().equals(Common.makeHash(inputBean.getCurrpwd().trim()))) {
                        inputBean.setRenewpwd(Common.makeHash(inputBean.getRenewpwd().trim()));
                        message = this.validatePassword();
                        if (message.isEmpty()) {
                            Audittrace audit = Common.makeAudittrace(request, TaskVarList.PW_RESET_TASK, PageVarList.LOGIN_PAGE, "User password reset", null);
                            int days = dao.getPassparamcount(CommonVarList.PW_PARAM_PW_AGE);
                            if (days == 0) {
                                days = CommonVarList.PWPARM_DEF_PW_AGE;
                            }
                            message = dao.UpdatePasswordReset(inputBean, audit, days);
                            if (message.isEmpty()) {
                                addActionMessage(MessageVarList.PASSWORDRESET_SUCCESS);
                                session.setAttribute("intercept", "PASSWORD_CHANGE_SUCCESS");
                            } else {
                                addActionError(message);
                            }
                        } else {
                            addActionError(message);
                        }
                    } else {
                        addActionError(MessageVarList.PASSWORDRESET_INVALID_CURR_PWD);
                    }

                } else {
                    addActionError(message);
                }
            } catch (HibernateException ex) {
                addActionError(MessageVarList.COMMON_ERROR_INPUTFIELDS);
                Logger.getLogger(PasswordResetAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            addActionError(MessageVarList.COMMON_ERROR_UPDATE + " password reset");
            Logger.getLogger(PasswordResetAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retType;
    }

    //validation of the input fields
    private String validatePassword() throws Exception {
        PasswordResetDAO dao = new PasswordResetDAO();
        Passwordpolicy passwordpolicy = dao.getPasswordPolicy(CommonVarList.STATUS_ACTIVE);
        String message = "";
        String password = inputBean.getNewpwd();
        int minUpper = 0;
        int minNum = 0;
        int minSpecial = 0;
        HashMap<Character, Character> policySpMap = new HashMap<Character, Character>();
        String sp = "";
        for (int i = 0; i < password.length(); i++) {
            char letter = password.charAt(i);
            if (Character.isUpperCase(letter)) {
                minUpper++;
            } else if (Character.isDigit(letter)) {
                minNum++;
            } else if (!Character.isLetterOrDigit(letter)) {
                minSpecial++;
                sp += letter;
            }
        }
        if (passwordpolicy != null) {
            if (passwordpolicy.getMinlength() > password.length()) {
                message = MessageVarList.PASSWORDRESET_PASSWORD_TOO_SHORT;
            } else if (passwordpolicy.getMaxlength() < password.length()) {
                message = MessageVarList.PASSWORDRESET_PASSWORD_TOO_LONG;
            } else if (passwordpolicy.getMinupperchars() > minUpper) {
                message = "Please add minimum " + passwordpolicy.getMinupperchars() + " uppercase character(s)";
            } else if (passwordpolicy.getMinnumchars() > minNum) {
                message = "Please add minimum " + passwordpolicy.getMinnumchars() + " digits.";
            } else if (passwordpolicy.getMinspecialchars() > minSpecial) {
                message = "Please add minimum " + passwordpolicy.getMinspecialchars() + " special character(s)";
            } else {
                //check special characters.
                for (int i = 0; i < passwordpolicy.getSpecialchars().length(); i++) {
                    policySpMap.put(passwordpolicy.getSpecialchars().charAt(i), passwordpolicy.getSpecialchars().charAt(i));
                }
                for (int i = 0; i < sp.length(); i++) {
                    if (!policySpMap.containsKey(sp.charAt(i))) {
                        message = "Password must contain only ' " + passwordpolicy.getSpecialchars() + " ' special character(s)";
                        break;
                    }
                }
            }
        } else {
            message = "";
        }
        if (message.isEmpty()) {
            int count = dao.getPasswordhistorycount();
            if (count != 0) {
                List<Passwordhistory> passhislist = dao.getPasswordHistoryList(count, inputBean.getHusername());
                if (!passhislist.isEmpty()) {
                    for (Passwordhistory passwordhistory : passhislist) {
                        if (passwordhistory.getPassword().trim().equals(inputBean.getRenewpwd())) {
                            message = MessageVarList.PASSWORDRESET_PASSWORD_HISTORY;
                            break;
                        }
                    }
                }
            }

        }
        return message;
    }

    //validation of the input fields
    private String validateInputs() {
        String message = "";
        if (inputBean.getCurrpwd() == null || inputBean.getCurrpwd().trim().isEmpty()) {
            message = MessageVarList.PASSWORDRESET_EMPTY_PASSWORD;
        } else if (inputBean.getNewpwd() == null || inputBean.getNewpwd().trim().isEmpty()) {
            message = MessageVarList.PASSWORDRESET_EMPTY_NEW_PASSWORD;
        } else if (inputBean.getRenewpwd() == null || inputBean.getRenewpwd().trim().isEmpty()) {
            message = MessageVarList.PASSWORDRESET_EMPTY_CONF_PASSWORD;
        } else if (!inputBean.getNewpwd().trim().contentEquals(inputBean.getRenewpwd().trim())) {
            message = MessageVarList.PASSWORDRESET_MATCH_PASSWORD;
        }
        return message;
    }

    private boolean applyUserPrivileges() {
        inputBean.setVupdatepwd(false);
        return true;
    }

    @Override
    public Object getModel() {
        return inputBean;
    }

    @Override
    public boolean checkAccess(String method, String userRole) {
        return true;
    }
}
