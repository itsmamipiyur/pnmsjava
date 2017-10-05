<?xml version="1.0" encoding="UTF-8"?>
<!--
    Document   : NewDecor
    Created on : 09 26, 17, 1:42:56 PM
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
                        <webuijsf:staticText id="staticText1" style="font-size: 36px; font-weight: bold; left: 360px; top: 48px; position: absolute" text="NEW DECOR"/>
                        <webuijsf:label id="label1" requiredIndicator="true" style="position: absolute; left: 264px; top: 192px" text="Name:"/>
                        <webuijsf:textField binding="#{pages$NewDecor.textField1}" columns="50" id="textField1" style="left: 360px; top: 192px; position: absolute"/>
                        <webuijsf:label id="label2" requiredIndicator="true" style="left: 264px; top: 168px; position: absolute" text="Type"/>
                        <webuijsf:label id="label3" requiredIndicator="true" style="left: 264px; top: 216px; position: absolute" text="Description"/>
                        <webuijsf:textArea binding="#{pages$NewDecor.textArea1}" columns="50" id="textArea1" rows="4" style="left: 360px; top: 216px; position: absolute"/>
                        <webuijsf:button actionExpression="#{pages$NewDecor.btnSubmit_action}" id="btnSubmit"
                            style="height: 24px; left: 359px; top: 312px; position: absolute; width: 71px" text="Submit"/>
                        <webuijsf:button actionExpression="#{pages$NewDecor.btnBack_action}" id="btnBack"
                            style="height: 24px; left: 479px; top: 312px; position: absolute; width: 71px" text="Back"/>
                        <webuijsf:dropDown binding="#{pages$NewDecor.dropDown1}" id="dropDown1" items="#{pages$NewDecor.dropDown1DefaultOptions1.options}"
                            selected="#{pages$NewDecor.dropDown1DefaultOptions1.selectedValue}" style="left: 360px; top: 168px; position: absolute"/>
                        <webuijsf:textField binding="#{pages$NewDecor.txtID}" disabled="true" id="txtID" style="left: 360px; top: 144px; position: absolute"/>
                        <webuijsf:label id="label4" style="left: 264px; top: 144px; position: absolute" text="Code:"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
