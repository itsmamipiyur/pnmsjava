<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : EventTypePage
    Created on : 09 26, 17, 1:19:25 PM
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
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 192px; top: 240px; position: absolute; width: 600px" title="Table" width="600">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{SessionBean1.eventTypeArr}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="eventTypeName" id="tableColumn1" sort="eventTypeName">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['eventTypeName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="eventTypeDesc" id="tableColumn2" sort="eventTypeDesc">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['eventTypeDesc']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Update" id="tableColumn3">
                                    <webuijsf:button actionExpression="#{pages$EventTypePage.btnUpdate_action}" id="btnUpdate" text="Select"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Deactivate" id="tableColumn4">
                                    <webuijsf:button actionExpression="#{pages$EventTypePage.btnDeactivate_action}" id="btnDeactivate" text="Select"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:button actionExpression="#{pages$EventTypePage.btnNew_action}" id="btnNew"
                            style="height: 24px; left: 191px; top: 192px; position: absolute; width: 120px" text="New Event Type"/>
                        <webuijsf:staticText id="staticText3" style="font-size: 36px; font-weight: bold; left: 384px; top: 96px; position: absolute" text="EVENT TYPE"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
