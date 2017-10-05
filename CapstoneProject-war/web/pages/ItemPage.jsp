<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : item
    Created on : 09 23, 17, 8:21:21 AM
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
                        <webuijsf:button actionExpression="#{pages$ItemPage.btnNew_action}" id="btnNew"
                            style="left: 167px; top: 168px; position: absolute; width: 96px" text="New Item"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 168px; top: 192px; position: absolute" title="Table" width="609">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{SessionBean1.itemArr}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="Name" id="tableColumn2" sort="itemName" width="209">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['itemName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Description" id="tableColumn3" sort="itemDesc">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['itemDesc']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Update" id="tableColumn4" width="200">
                                    <webuijsf:button id="button1" text="Update"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Delete" id="tableColumn5" width="200">
                                    <webuijsf:button id="button2" text="Delete"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:staticText id="staticText4" style="font-size: 36px; font-weight: bold; left: 432px; top: 72px; position: absolute" text="ITEM"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
