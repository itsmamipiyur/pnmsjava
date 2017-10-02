<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : NewEventTypePage
    Created on : 09 23, 17, 9:51:44 AM
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
                        <webuijsf:staticText id="staticText1" style="font-size: 24px; font-weight: bold; left: 360px; top: 144px; position: absolute" text="NEW EVENT TYPE"/>
                        <webuijsf:label id="label1" requiredIndicator="true" style="left: 240px; top: 216px; position: absolute" text="Name:"/>
                        <webuijsf:textField columns="50" id="textField1" style="left: 336px; top: 216px; position: absolute"/>
                        <webuijsf:button actionExpression="#{pages$NewEventTypePage.btnSubmit_action}" id="btnSubmit"
                            style="height: 24px; left: 383px; top: 336px; position: absolute; width: 71px" text="Submit"/>
                        <webuijsf:button actionExpression="#{pages$NewEventTypePage.btnBack_action}" id="btnBack"
                            style="height: 24px; left: 479px; top: 336px; position: absolute; width: 72px" text="Back"/>
                        <webuijsf:label id="label2" requiredIndicator="true" style="left: 240px; top: 240px; position: absolute" text="Description"/>
                        <webuijsf:textArea columns="50" id="textArea1" rows="4" style="left: 336px; top: 240px; position: absolute"/>
                        <webuijsf:label id="label3" style="position: absolute; left: 240px; top: 192px" text="Code:"/>
                        <webuijsf:textField binding="#{pages$NewEventTypePage.txtID}" disabled="true" id="txtID" style="left: 336px; top: 192px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
