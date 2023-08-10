<%-- 
    Document   : defaultaccesscontroler
    Created on : Jun 20, 2013, 12:06:02 PM
    Author     : Amila Jayasekara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
    <head>
        
        <script type="text/javascript">
            function loadonstart(){
                window.location="${pageContext.request.contextPath}/LogoutUserLogin.blb?";
            }
            window.onload=loadonstart(); 
        </script>
    </head>
    <body>
        
    </body>
</html>
