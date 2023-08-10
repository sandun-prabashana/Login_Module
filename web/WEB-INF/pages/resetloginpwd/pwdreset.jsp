<%-- 
    Document   : pwdreset
    Created on : 21/06/2013 15:21:29 AM
    Author     : Amila Jayasekara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="/WEB-INF/pages/template/header.jspf" %>
        <title>Reset Password</title>
        <script type="text/javascript">
            $.subscribe('resetButton', function (event, data) {
                $("#aresetdialog").html("Are you want to reset?").dialog('open');
            });
            function resetButtonfn() {
                $('#message').empty();
                $('#currpwd').val("");
                $('#newpwd').val("");
                $('#renewpwd').val("");
            }	
            function resetData() {
                $('#currpwd').val("");
                $('#newpwd').val("");
                $('#renewpwd').val("");
                window.location = "${pageContext.request.contextPath}/LogoutUserLogin.blb?";
            }
        </script>
    </head>
    <body>
        <!-- Header body part -->
        <%@include file="/WEB-INF/pages/template/headcomponents.jspf" %>
        <div class="mv-body f-right mv-header-text" >
            <s:div id="message">
                <s:actionerror theme="jquery"/>
                <s:actionmessage theme="jquery"/>
            </s:div>
            <s:set var="vupdatepwd"><s:property value="vupdatepwd" default="true"/></s:set>
                <div class="mv-form">
                <s:form action="PasswordReset" theme="simple" method="post" id="searchform">
                    <div class="row">
                        <div class="col-md-3">
                            <div class="form-group">
                                <label class="control-label">User Name </label>
                                <s:textfield cssClass="form-control" name="username" id="username" disabled="true"/>
                                <s:hidden name="husername" id="husername" />
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="form-group">
                                <label class="control-label">Employee ID</label>
                                <s:textfield cssClass="form-control" name="employeeid" id="employeeID" disabled="true"/>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="form-group">
                                <label class="control-label">User Role</label>
                                <s:textfield  cssClass="form-control" id="userrole"  name="userrole" disabled="true"/>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="form-group">
                                <label class="control-label">Current Password <span style="color: red">*</span></label>
                                <s:password  cssClass="form-control" name="currpwd" id="currpwd" autocomplete="off"/>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-3">
                            <div class="form-group">
                                <label class="control-label">New Password<span style="color: red">*</span></label>
                                <s:password cssClass="form-control" name="newpwd" id="newpwd" autocomplete="off"/>
                            </div>
                        </div> 
                        <div class="col-md-3">
                            <div class="form-group">
                                <label class="control-label">Confirm New Password<span style="color: red">*</span></label>
                                <s:password  cssClass="form-control" name="renewpwd" id="renewpwd" autocomplete="off"/>
                            </div>
                        </div> 
                    </div> 
                    <div class="row">
                        <div class="col-md-6">
                            <div class="mv-mandatory-field"><span class="mandatoryfield">Mandatory fields are marked with *</span></div>
                        </div>
                    </div>       

                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group mv-margin">
                                <s:url var="pwreseturl" action="EditPasswordReset"/>                                   
                                <sj:submit 
                                    button="true"
                                    href="%{pwreseturl}"
                                    disabled="#vupdatepwd"
                                    value="Accept"
                                    cssClass="btn btn-mv-submit btn-sm"
                                    targets="message"
                                    />      
                                <sj:submit cssClass="btn  btn-mv-reset btn-sm" button="true" value="Reset" onClickTopics="resetButton"/>                                    
                            </div>
                        </div>
                    </div> 
                    <div hidden="true">
                        <div><!--CSRF Value Set--></div>
                        <div><s:hidden name="csrfValue" id="csrfValue" value="%{#session.csrfValue}"/>
                        </div>
                    </div>
                </s:form>
            </div>
        </div><!-- #container-->
        <!-- Start add reset dialog box -->
        <sj:dialog 
            id="aresetdialog" 
            buttons="{ 
            'Yes':function() { resetButtonfn();$( this ).dialog( 'close' ); },
            'No':function() { $( this ).dialog( 'close' );} 
            }" 
            autoOpen="false" 
            modal="true" 
            title="Reset"
            width="400"
            height="150"
            position="center"
            />
<!-- End add reset dialog box -->	
        <%@include file="/WEB-INF/pages/template/footer.jspf" %>
    </body>
</html>
