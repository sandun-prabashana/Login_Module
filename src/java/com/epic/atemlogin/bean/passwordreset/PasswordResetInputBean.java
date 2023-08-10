/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.atemlogin.bean.passwordreset;

/**
 *
 * @author darshana_t
 */
public class PasswordResetInputBean {

    /*------------------------ input data  ------------------------------*/
    private String username;
    private String employeeid;
    private String userrole;
    private String currpwd;
    private String newpwd;
    private String renewpwd;
    private String husername;
    /*-------for access control-----------*/
    private boolean vupdatepwd;

    /*-------for access control-----------*/
 /*------------------------ input data------------------------------*/

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }

    public String getCurrpwd() {
        return currpwd;
    }

    public void setCurrpwd(String currpwd) {
        this.currpwd = currpwd;
    }

    public String getNewpwd() {
        return newpwd;
    }

    public void setNewpwd(String newpwd) {
        this.newpwd = newpwd;
    }

    public String getRenewpwd() {
        return renewpwd;
    }

    public void setRenewpwd(String renewpwd) {
        this.renewpwd = renewpwd;
    }

    public String getHusername() {
        return husername;
    }

    public void setHusername(String husername) {
        this.husername = husername;
    }

    public boolean isVupdatepwd() {
        return vupdatepwd;
    }

    public void setVupdatepwd(boolean vupdatepwd) {
        this.vupdatepwd = vupdatepwd;
    }

}
