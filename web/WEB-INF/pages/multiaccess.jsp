<%-- 
    Document   : multiaccess
    Created on : 17/06/2013, 10:21:46
    Author     : Amila Jayasekara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <script type="text/javascript">
            function loadonstart() {
                localStorage.setItem('logout-event', 'login' + Math.random());
                window.location = "${pageContext.request.contextPath}/LogoutUserLogin.blb?message=error2";
            }
            window.onload = loadonstart();
        </script>
    </head>
    <body>
    </body>
</html>
