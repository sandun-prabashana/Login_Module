<%-- 
    Document   : template
    Created on : 27/03/2013, 10:08:43
    Author     : asitha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="/WEB-INF/pages/template/header.jspf" %>
    </head>
    <body>
        <!-- Header body part -->
        <div id="wrapper">
            <%@include file="/WEB-INF/pages/template/headcomponents.jspf" %>
            <div id="container" >
                Your content here ............ 
             </div><!-- #container-->
            </div><!-- #middle-->
            <%@include file="/WEB-INF/pages/template/footer.jspf" %>       
        </div><!-- #wrapper -->
    </body>
</html>
