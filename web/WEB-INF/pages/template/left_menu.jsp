<%-- 
    Document   : left_menu
    Created on : Feb 6, 2023, 1:00:24 PM
    Author     : darshana_t
--%>
<%@page import="java.util.TreeSet"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.epic.eapgma.util.common.SectionComparator"%>
<%@page import="com.epic.eapgma.util.varlist.SessionVarlist"%>
<%@page import="com.epic.eapgma.util.mapping.Section"%>
<%@page import="com.epic.eapgma.util.mapping.Page"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="resources/css/main.css" rel="stylesheet" />
        <link href="resources/css/home.css" rel="stylesheet" />
        <link href="resources/css/body.css" rel="stylesheet" />
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    </head>
    <body>
        <div id="leftbar">

            <aside class="sidebar-left-collapse">
                <div class="ntb_main">
                    <div id="styles_cmw">
                        Main Menu
                    </div>
                </div>
                <div class="sidebar-links">

                    <%

                        try {

                            HashMap<Section, List<Page>> sectionPageList = (HashMap<Section, List<Page>>) request.getSession().getAttribute(SessionVarlist.SECTIONPAGELIST);
                    %>

                    <%
                            SectionComparator sec1 = new SectionComparator();
                            Set<Section> section = new TreeSet<Section>(sec1);

                            Set<Section> section1 = sectionPageList.keySet();
                            for (Section sec2 : section1) {
                                section.add(sec2);
                            }

                            int secId = 1;
                            int pageId = 1000;

                            for (Section sec : section) {
                                int a = 0;
                                out.println("<div id=\'link_" + secId + "\' class=\'link-default\'>");
                                out.println("<a href=\'javascript:void(0)\'>" + sec.getDescription() + "<img src=\'resources/img/drop-down.svg\' style=\'height: 12px;width: 20px; float:right;padding:5px;\'/></a>");

                                out.println("<ul class=\'sub-links\'>");

                                List<Page> pageList = sectionPageList.get(sec);
                                for (Page pageBean : pageList) {

                                    pageId++;

                                    out.println("<li id=\'sublink_" + pageId + "\'>");
                                    out.println("<a href=\'" + request.getContextPath() + "/" + pageBean.getUrl() + ".blb\'>");
                                    out.println("&nbsp;" + pageBean.getDescription());
                                    out.println("</a>");
                                    out.println("</li>");

                                }

                                out.println(" </ul>");
                                out.println(" </div>");

                                secId++;
                            }

                        } catch (Exception ee) {

                            ee.printStackTrace();
                        }
                    %>

                </div>
            </aside>
        </div>
        <script src="resources/js/main.js"></script>
    </body>
</html>
