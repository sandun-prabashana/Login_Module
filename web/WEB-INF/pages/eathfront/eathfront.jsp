<%-- 
    Document   : eathfront
    Created on : Feb 23, 2023, 9:37:49 PM
    Author     : darshana_t
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="/WEB-INF/pages/template/header.jspf" %>
        <title></title>
        <script type="text/javascript">
            $(document).ready(function () {
                let usertype = $('#usertype').val();
                var admin = document.getElementById("adminicon");
                var tms = document.getElementById("tmsicon");

                if (usertype == "1") {
                    admin.style.display = "block";
                    tms.style.display = "none";
                } else if (usertype == "2") {
                    admin.style.display = "none";
                    tms.style.display = "block";
                } else if (usertype == "3") {
                    admin.style.display = "block";
                    tms.style.display = "block";
                } else {
                    admin.style.display = "none";
                    tms.style.display = "none";
                }

                /* check browser tab key */
                if (typeof (Storage) !== "undefined") {
                    var tabKey = sessionStorage.cbkey;
                    var property = '<%= session.getAttribute("cbkey")%>';
                    var sTabKey = property;
                    if (tabKey == sTabKey) {
                        /* do nothing */
                    } else {
                        window.location = "${pageContext.request.contextPath}/LogoutUserLogin.blb?message=error0";
                    }
                    /* console.log(tabKey + '--' +sTabKey); */
                } else {
                    /* Sorry! No Web Storage support. */
                    $(".pagecontent").html("This browser isn't supporting. Please update your browser to continue.");
                    console.log("Storage Un-defined");
                    window.location = "${pageContext.request.contextPath}/LogoutUserLogin.blb?";
                }
            });

            $.subscribe('onclickAdmin', function (event, data) {
                var adminurl = $('#adminurl').val() + "?param=" + $('#param').val();
                window.open(adminurl, '', 'fullscreen=yes,scrollbars=1', 'true');
            });

            $.subscribe('onclickTMS', function (event, data) {
                var tmsurl = $('#tmsurl').val() + "?param=" + $('#param').val();
                window.open(tmsurl, '', 'fullscreen=yes,scrollbars=1', 'true');
            });

        </script>
    </head>
    <body>
        <%@include file="/WEB-INF/pages/template/headcomponents.jspf" %>
        <s:hidden name="usertype" id="usertype" />
        <s:hidden name="adminurl" id="adminurl" />
        <s:hidden name="tmsurl" id="tmsurl" />
        <s:hidden name="param" id="param" />
        <table style="position: absolute; margin: 10%; width: 80%;">
            <tr>
                <td>
                    <div id="adminicon">
                        <sj:a 
                            id="adminbut" 
                            button="true"
                            onClickTopics="onclickAdmin">
                            <img style="height: 300px; width: 400px;" src="resources/assets/image/admin.png"/>
                        </sj:a>
                        <br>
                        <div style="width: 400px;">
                            <label style="margin-top: 2%; 
                                   font-size: large; 
                                   display: inline-block;
                                   text-align: right;
                                   float: left;">Admin Web</label>
                        </div>
                    </div>
                </td>
                <td>
                    <div id="tmsicon">
                        <sj:a 
                            cssStyle="margin-left: 20%;"
                            id="tmsbut" 
                            button="true"
                            onClickTopics="onclickTMS">
                            <img style="height: 300px; width: 400px;" src="resources/assets/image/tms.png"/>
                        </sj:a>
                        <br>
                        <div style="width: 400px;">
                            <label style="margin-top: 2%; 
                                   font-size: large; 
                                   display: inline-block;
                                   text-align: right;
                                   float: left;">TMS Web</label>
                        </div>
                    </div> 
                </td>
            </tr>
        </table>



        <%@include file="/WEB-INF/pages/template/footer.jspf" %>
    </body>
</html>
