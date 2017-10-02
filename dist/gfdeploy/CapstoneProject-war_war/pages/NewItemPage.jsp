<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : newitem
    Created on : 09 23, 17, 8:28:09 AM
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
                        <webuijsf:textField columns="50" id="textField1" style="left: 360px; top: 168px; position: absolute"/>
                        <webuijsf:label id="label1" requiredIndicator="true" style="left: 264px; top: 168px; position: absolute" text="Name"/>
                        <webuijsf:label id="label2" style="left: 264px; top: 192px; position: absolute" text="Description"/>
                        <webuijsf:label id="label3" requiredIndicator="true" style="left: 264px; top: 288px; position: absolute" text="Item Type"/>
                        <webuijsf:dropDown binding="#{pages$NewItemPage.ddItemType}" id="ddItemType"
                            items="#{pages$NewItemPage.ddItemTypeDefaultOptions.options}" style="left: 360px; top: 288px; position: absolute" width="200"/>
                        <webuijsf:label id="label4" style="left: 528px; top: 336px; position: absolute" text="Rental Information"/>
                        <webuijsf:label id="label5" requiredIndicator="true" style="left: 264px; top: 384px; position: absolute" text="Basic Rate Type"/>
                        <webuijsf:dropDown id="dropDown2" items="#{pages$NewItemPage.dropDown2DefaultOptions.options}"
                            style="left: 432px; top: 384px; position: absolute" width="100"/>
                        <webuijsf:label id="label6" requiredIndicator="true" style="left: 576px; top: 384px; position: absolute" text="Extension Rate Type"/>
                        <webuijsf:dropDown id="dropDown3" items="#{pages$NewItemPage.dropDown3DefaultOptions.options}"
                            style="left: 768px; top: 384px; position: absolute" width="100"/>
                        <webuijsf:textField id="textField5" style="left: 432px; top: 408px; position: absolute"/>
                        <webuijsf:textField id="textField6" style="left: 768px; top: 408px; position: absolute"/>
                        <webuijsf:label id="label9" requiredIndicator="true" style="left: 264px; top: 408px; position: absolute" text="Basic Rate"/>
                        <webuijsf:label id="label10" requiredIndicator="true" style="left: 576px; top: 408px; position: absolute" text="Extension Rate"/>
                        <webuijsf:textField id="textField7" style="left: 432px; top: 432px; position: absolute"/>
                        <webuijsf:textField id="textField8" style="left: 768px; top: 432px; position: absolute"/>
                        <webuijsf:label id="label11" requiredIndicator="true" style="left: 264px; top: 432px; position: absolute" text="Maximum Basic Duration"/>
                        <webuijsf:label id="label12" requiredIndicator="true" style="left: 576px; top: 432px; position: absolute" text="Maximum Extension Duration"/>
                        <webuijsf:label id="label13" style="left: 528px; top: 480px; position: absolute" text="Penalty Information"/>
                        <webuijsf:textField id="textField11" style="left: 432px; top: 504px; position: absolute"/>
                        <webuijsf:textField id="textField12" style="left: 768px; top: 504px; position: absolute"/>
                        <webuijsf:label id="label16" requiredIndicator="true" style="left: 264px; top: 504px; position: absolute" text="Limit"/>
                        <webuijsf:label id="label17" requiredIndicator="true" style="left: 576px; top: 504px; position: absolute" text="Penalty Charge %"/>
                        <webuijsf:textArea columns="50" id="textArea1" rows="5" style="left: 360px; top: 192px; position: absolute"/>
                        <webuijsf:staticText id="staticText1" style="font-size: 36px; font-weight: bold; left: 504px; top: 96px; position: absolute" text="NEW ITEM"/>
                        <webuijsf:button actionExpression="#{pages$NewItemPage.btnNewItemType_action}" id="btnNewItemType"
                            style="height: 24px; left: 575px; top: 288px; position: absolute; width: 72px" text="New"/>
                        <webuijsf:button actionExpression="#{pages$NewItemPage.btnSubmit_action}" id="btnSubmit"
                            style="height: 24px; left: 504px; top: 576px; position: absolute; width: 71px" text="Submit"/>
                        <webuijsf:button actionExpression="#{pages$NewItemPage.btnCancel_action}" id="btnCancel"
                            style="height: 24px; left: 599px; top: 576px; position: absolute; width: 71px" text="Cancel"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
