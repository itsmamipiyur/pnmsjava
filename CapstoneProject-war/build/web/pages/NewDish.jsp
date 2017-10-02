<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : NewDish
    Created on : 09 26, 17, 2:39:07 PM
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
                        <webuijsf:staticText id="staticText1" style="font-size: 36px; font-weight: bold; left: 360px; top: 48px; position: absolute" text="New Dish"/>
                        <webuijsf:label id="label1" requiredIndicator="true" style="left: 240px; top: 120px; position: absolute" text="Type:"/>
                        <webuijsf:dropDown binding="#{pages$NewDish.ddDishType}" id="ddDishType" items="#{pages$NewDish.ddDishTypeDefaultOptions.options}"
                            style="left: 336px; top: 120px; position: absolute" width="250"/>
                        <webuijsf:label id="label2" requiredIndicator="true" style="left: 240px; top: 144px; position: absolute" text="Name:"/>
                        <webuijsf:textField columns="50" id="textField1" style="left: 336px; top: 144px; position: absolute"/>
                        <webuijsf:label id="label3" style="left: 240px; top: 168px; position: absolute" text="Description:"/>
                        <webuijsf:textArea columns="50" id="textArea1" rows="4" style="left: 336px; top: 168px; position: absolute"/>
                        <webuijsf:label id="label4" requiredIndicator="true" style="left: 240px; top: 264px; position: absolute" text="Price (per pax):"/>
                        <webuijsf:textField id="textField2" style="left: 336px; top: 264px; position: absolute"/>
                        <webuijsf:button actionExpression="#{pages$NewDish.btnSubmit_action}" id="btnSubmit"
                            style="height: 24px; left: 359px; top: 312px; position: absolute; width: 71px" text="Submit"/>
                        <webuijsf:button actionExpression="#{pages$NewDish.btnBack_action}" id="btnBack"
                            style="height: 24px; left: 455px; top: 312px; position: absolute; width: 72px" text="Back"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
