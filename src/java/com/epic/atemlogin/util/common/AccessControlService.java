/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.atemlogin.util.common;

/**
 *
 * Document   : AccessControlService
 * Created on : 17/06/2013, 10:09:31
 * Author     : Amila Jayaserkara
 *
 */
public interface AccessControlService {
    public boolean checkAccess(String method, String userRole);
}
