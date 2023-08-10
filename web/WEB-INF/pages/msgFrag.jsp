<%-- 
    Document   : testFrag
    Created on : Apr 5, 2013, 4:02:40 PM
    Author     : Roshen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
    <s:if test="hasActionMessages()">
        <script type="text/javascript">resetData();</script>
        <s:actionmessage theme="jquery"/>
    </s:if>
    <s:if test="hasActionErrors()">
        <script type="text/javascript"></script>
        <s:actionerror theme="jquery"/>
    </s:if>

