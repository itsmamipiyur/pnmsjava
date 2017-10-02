<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : menu
    Created on : 09 23, 17, 8:24:05 AM
    Author     : Acer
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:button actionExpression="#{pages$AdminMenu.btnEventType_action}" id="btnEventType"
                        style="height: 24px; left: -1px; top: 24px; position: absolute; width: 192px" text="Event Type"/>
                    <webuijsf:form id="form1">
                        <webuijsf:button actionExpression="#{pages$AdminMenu.btnDish_action}" id="btnDish"
                            style="height: 23px; left: -1px; top: 96px; position: absolute; width: 192px" text="Dish"/>
                        <webuijsf:button actionExpression="#{pages$AdminMenu.btnItem_action}" id="btnItem" style="height: 24px; width: 192px" text="Item"/>
                        <webuijsf:button actionExpression="#{pages$AdminMenu.btnDishType_action}" id="btnDishType"
                            style="height: 24px; left: -1px; top: 72px; position: absolute; width: 191px" text="Dish Type"/>
                        <webuijsf:button actionExpression="#{pages$AdminMenu.btnDecor_action}" id="btnDecor"
                            style="height: 24px; left: -1px; top: 48px; position: absolute; width: 191px" text="Decor"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
