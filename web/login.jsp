<%-- 
    Document   : login
    Created on : 9/01/2013, 09:59:20
    Author     : asitha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page trimDirectiveWhitespaces="true" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link href="${pageContext.request.contextPath}/resources/assets/css/main.css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/resources/assets/css/login.css" rel="stylesheet" />
        <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/resources/assets/image/favicon.png">
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/sha1.js"></script>    
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/jquery.min.js"></script>    

        <title>EPIC MOBILE PUSH PAYMENT PLATFORM</title>
        <script type="text/javascript">

            window.onload = closetab();
            
            $(document).ready(function () {
                //create tab key
                if (typeof (Storage) !== "undefined") {
                    var ranKey = Math.floor((Math.random() * 100000) + 1);
                    sessionStorage.setItem("cbkey", ranKey);
                    $("#browserTabKey").val(ranKey);
                    console.log(sessionStorage.cbkey + "--" + $("#browserTabKey").val());
                } else {
                    // Sorry! No Web Storage support..
                    console.log("Storage Un-Defined");
                }

            });

            function closetab() {
//                window.close();
                if (localStorage.getItem('logout-event') != null) {
                    window.close();
                }

            }

            window.localStorage.removeItem('link');
            window.localStorage.removeItem('sublink');
            window.localStorage.removeItem("scroll");



            function encrypt(form) {
                if ($('#password').val() != "")
                    $('#password').val(SHA1($('#password').val()));
            }

        </script>
    </head>

    <body>
        <div class="login-bg">
            <div class="intro-wrapper">
                <div class="intro">
                    <p class="top-section"><span class="quotes">“</span>Single solution</span</p>
                    <div class="bottom-section">
                        <div></div>
                        <p>to manage every aspect <span class="highlight">Android POS</span><br>from <span class="highlight">bank</span> to <span class="highlight">merchant</span><br>towards <span class="highlight">secure</span> transactions<span class="quotes">”</span></p>                  
                    </div>
                </div>

            </div>
            <div class="login-white-fg">
                <div class="white-square">
                    <s:form id="login-form" method="post" action="CheckUserLogin" theme="simple" onSubmit="return encrypt(this);" namespace="/">
                        <img class="logo" src="${pageContext.request.contextPath}/resources/assets/image/logo_login_normal.svg" width="60" height="auto" alt="logo" />
                        <div class="form-row"> 
                            <div class="input-wrapper">
                                <img src="${pageContext.request.contextPath}/resources/assets/image/icons/user.svg"/>
                                <span></span>
                                <s:textfield cssClass ="input" name="username" id="username" placeholder="Username"/>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="input-wrapper">
                                <img src="${pageContext.request.contextPath}/resources/assets/image/icons/lock.svg"/>
                                <span></span>
                                <s:password cssClass ="input" name="password" id="password" placeholder="Password"/>
                                <s:hidden name="browserTabKey" id="browserTabKey"/>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="button-wrapper">
                                <%--<sj:submit  button="true"  value="Login"  id="loginbut" class="btn"/>--%>
                                <button class="button" type="submit">Login<img src="${pageContext.request.contextPath}/resources/assets/image/icons/login_button_arrow.svg"></button>
                            </div>
                        </div>
                        <div class="form-row message-panel" >
                            <s:actionerror theme="jquery" />
                            <s:actionmessage theme="jquery"/>
                        </div>

                    </s:form>
                    <p class="footer-description">
                        Android Experience Hub V 1.00 Powered by Epic Lanka Technologies (Pvt.) Ltd.
                    </p>
                </div>
                <div class="white-trangle"></div>
            </div> 
        </div>


        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/main.js"></script>
    </body>

</html>