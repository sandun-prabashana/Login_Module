<%-- 
    Document   : top_menu
    Created on : Feb 6, 2023, 12:54:39 PM
    Author     : darshana_t
--%>
<script type="text/javascript">
    function logoutApps() {
        localStorage.setItem('logout-event', 'login' + Math.random());
        window.close();
    }
</script>

<div id="wait" style="transition: 0.5s;display:none;width:89px;height:89px;position:absolute;top:120%;left:50%;padding:2px;z-index: 2000000000"><img src='${pageContext.request.contextPath}/resources/img/loading.gif' width="60" height="60" /></div>
<div id="wait2" style="
     transition: 0.5s;
     width: 100%;
     height: 100%;
     background-color: rgba(0, 0, 0, 0.57);
     position: fixed;
     z-index: 200000;
     top: 0;
     left: 0;
     display: none;
     "></div>


<!-- new header-->
<div class="fixed-header" id='header'>
    <div class="header-content">
        <img class="logo" src="resources/assets/image/header-logo.svg"/>
        <div class="user-action-icon" title="Logout" onclick="logoutApps();">
            <s:a action="LogoutUserLogin" ><img src="resources/assets/image/icons/logout.svg"></s:a> 
        </div>
        <!--        <div class="user-action-icon" title="Password Change">
                    <s:a action="ViewPasswordReset" ><img src="resources/assets/image/icons/key.svg"/></s:a>
                </div>-->
        <span class="seperator"></span>
        <p class="user-role">${SYSTEMUSER.username}</p>
    </div>
    <div class="header-underline"></div>
</div>

<!--bread-crum-->
<div class="breadcrum">
    <div class="breadcrum-content" >
        <span class="breadcrum-section"> ${SELECTSECTIONNAME} </span> <img src="resources/assets/image/icons/rightArrow.svg" /> <span class="breadcrum-page"> ${CURRENTPAGE} </span>
    </div>
</div>