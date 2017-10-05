<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : NewCateringPackae
    Created on : 10 5, 17, 3:31:58 PM
    Author     : ChristelleAnne
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
                        <webuijsf:staticText id="staticText1" style="font-size: 36px; font-weight: bold; left: 168px; top: 48px; position: absolute" text="New Catering Package"/>
                        <webuijsf:label id="label1" requiredIndicator="true" style="left: 96px; top: 144px; position: absolute" text="Name:"/>
                        <webuijsf:textField binding="#{pages$NewCateringPackage.txtID}" disabled="true" id="txtID" style="left: 192px; top: 120px; position: absolute"/>
                        <webuijsf:textField binding="#{pages$NewCateringPackage.txtName}" columns="50" id="txtName" style="left: 192px; top: 144px; position: absolute"/>
                        <webuijsf:label id="label2" style="left: 96px; top: 168px; position: absolute" text="Description"/>
                        <webuijsf:textArea binding="#{pages$NewCateringPackage.txtDesc}" columns="50" id="txtDesc" rows="4" style="left: 192px; top: 168px; position: absolute"/>
                        <webuijsf:button actionExpression="#{pages$NewCateringPackage.btnSubmit_action}" id="btnSubmit"
                            style="height: 24px; left: 191px; top: 240px; position: absolute; width: 71px" text="Submit"/>
                        <webuijsf:button actionExpression="#{pages$NewCateringPackage.btnBack_action}" id="btnBack"
                            style="height: 24px; left: 287px; top: 240px; position: absolute; width: 71px" text="Back"/>
                        <webuijsf:label id="label3" style="left: 96px; top: 120px; position: absolute" text="Code:"/>
                        <webuijsf:messageGroup id="messageGroup1" style="left: 552px; top: 144px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
