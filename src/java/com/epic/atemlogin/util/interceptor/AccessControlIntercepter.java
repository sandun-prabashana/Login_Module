/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.atemlogin.util.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.Interceptor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;

/**
 *
 * Document : AccessControlIntercepter Created on : 17/06/2013, 10:16:32 Author
 * : Amila Jayasekara
 *
 */
public class AccessControlIntercepter implements Interceptor {

    @Override
    public void destroy() {
        System.out.println("Access Control Interceptor : Destroyed");
    }

    @Override
    public void init() {
        System.out.println("Access Control Interceptor : Initialized");
    }

    @Override
    public String intercept(ActionInvocation ai) throws Exception {
        String result = "";
        String INTERCEPT_LOGOUT = "acccontroler";
        try {
            System.out.println("-------Access Control Interceptor : Started-------");
            String className = ai.getAction().getClass().getName();
            System.out.println("Access Control Interceptor : Intercepted " + className);

            ActionProxy ap = ai.getProxy();
            String method = ap.getMethod();

            System.out.println("Access Control Interceptor : Method " + method);

            HttpServletResponse response = ServletActionContext.getResponse();
            // Set standard HTTP/1.1 no-cache headers.
            response.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate");
            response.setHeader("Pragma", "no-cache");
            response.setDateHeader("Expires", 0);

            //New Header to avoid MIME type sniffing
            response.setHeader("X-Content-Type-Options", "nosniff");

            if (method.trim().equalsIgnoreCase("Check") || method.trim().equalsIgnoreCase("Logout")) {
                result = ai.invoke();
            }else if(className.equalsIgnoreCase("com.epic.atemlogin.action.passwordreset.PasswordResetAction") 
                    && (method.trim().equalsIgnoreCase("View") || method.trim().equalsIgnoreCase("Edit"))){
                result = ai.invoke();
            }
        } catch (Exception e) {
            e.printStackTrace();
            Logger.getLogger(AccessControlIntercepter.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Access Control Interceptor : result " + result);
        System.out.println("-------Access Control Interceptor : Stopped-------");
        return result;
    }
}
