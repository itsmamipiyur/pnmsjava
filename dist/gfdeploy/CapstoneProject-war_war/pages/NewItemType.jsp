<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : ItemTypePage
    Created on : 09 23, 17, 9:14:33 AM
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
                    <webuijsf:form id="form1">
                        <webuijsf:staticText id="staticText1" style="font-size: 24px; font-weight: bold; left: 408px; top: 144px; position: absolute" text="NEW ITEM TYPE"/>
                        <webuijsf:label id="label1" requiredIndicator="true" style="left: 288px; top: 216px; position: absolute" text="Name:"/>
                        <webuijsf:textField columns="50" id="textField1" style="left: 360px; top: 216px; position: absolute"/>
                        <webuijsf:button actionExpression="#{pages$NewItemType.btnSubmit_action}" id="btnSubmit"
                            style="height: 24px; left: 407px; top: 288px; position: absolute; width: 71px" text="Submit"/>
                        <webuijsf:button actionExpression="#{pages$NewItemType.btnBack_action}" id="btnBack"
                            style="height: 24px; left: 503px; top: 288px; position: absolute; width: 72px" text="Back"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
