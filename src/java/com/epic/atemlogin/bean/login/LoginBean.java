/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.atemlogin.bean.login;

import java.util.List;

/**
 *
 * Document : LoginBean Created on : 27/03/2013, 15:10:31 Author : Asitha Perera
 *
 */
public class LoginBean {

    private String username;
    private String password;
    private byte attempts;
    private String status;
    private String message;
    private String choosesection;
    private String hchoosesection;
    private String version;
    private String browserTabKey;
    private String param;
    private int usertype;
    private String adminurl;
    private String tmsurl;

    private Integer rows = 0;
    private Integer page = 0;
    private Integer total = 0;
    private Long records = 0L;
    private String sord;
    private String sidx;
    private String searchField;
    private String searchString;
    private String searchOper;
    private boolean loadonce = false;
    /*------------------------Transaction Management Page table------------------------------*/
    private List<String> currentList;
    private List<String> newList;
    private String searchmerchantid;
    private String searchtxntype;
    private boolean vmerchantlogin;
    private boolean vsearch;
    private boolean vview;

    /*-----------------------Transaction Management Page  ------------------------------*/
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getAttempts() {
        return attempts;
    }

    public void setAttempts(byte attempts) {
        this.attempts = attempts;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getChoosesection() {
        return choosesection;
    }

    public void setChoosesection(String choosesection) {
        this.choosesection = choosesection;
    }

    public String getHchoosesection() {
        return hchoosesection;
    }

    public void setHchoosesection(String hchoosesection) {
        this.hchoosesection = hchoosesection;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Long getRecords() {
        return records;
    }

    public void setRecords(Long records) {
        this.records = records;
    }

    public String getSord() {
        return sord;
    }

    public void setSord(String sord) {
        this.sord = sord;
    }

    public String getSidx() {
        return sidx;
    }

    public void setSidx(String sidx) {
        this.sidx = sidx;
    }

    public String getSearchField() {
        return searchField;
    }

    public void setSearchField(String searchField) {
        this.searchField = searchField;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public String getSearchOper() {
        return searchOper;
    }

    public void setSearchOper(String searchOper) {
        this.searchOper = searchOper;
    }

    public boolean isLoadonce() {
        return loadonce;
    }

    public void setLoadonce(boolean loadonce) {
        this.loadonce = loadonce;
    }

    public List<String> getCurrentList() {
        return currentList;
    }

    public void setCurrentList(List<String> currentList) {
        this.currentList = currentList;
    }

    public List<String> getNewList() {
        return newList;
    }

    public void setNewList(List<String> newList) {
        this.newList = newList;
    }

    public String getSearchmerchantid() {
        return searchmerchantid;
    }

    public void setSearchmerchantid(String searchmerchantid) {
        this.searchmerchantid = searchmerchantid;
    }

    public String getSearchtxntype() {
        return searchtxntype;
    }

    public void setSearchtxntype(String searchtxntype) {
        this.searchtxntype = searchtxntype;
    }

    public boolean isVmerchantlogin() {
        return vmerchantlogin;
    }

    public void setVmerchantlogin(boolean vmerchantlogin) {
        this.vmerchantlogin = vmerchantlogin;
    }

    public boolean isVsearch() {
        return vsearch;
    }

    public void setVsearch(boolean vsearch) {
        this.vsearch = vsearch;
    }

    public boolean isVview() {
        return vview;
    }

    public void setVview(boolean vview) {
        this.vview = vview;
    }

    public int getUsertype() {
        return usertype;
    }

    public void setUsertype(int usertype) {
        this.usertype = usertype;
    }

    public String getAdminurl() {
        return adminurl;
    }

    public void setAdminurl(String adminurl) {
        this.adminurl = adminurl;
    }

    public String getTmsurl() {
        return tmsurl;
    }

    public void setTmsurl(String tmsurl) {
        this.tmsurl = tmsurl;
    }

    public String getBrowserTabKey() {
        return browserTabKey;
    }

    public void setBrowserTabKey(String browserTabKey) {
        this.browserTabKey = browserTabKey;
    }

}
