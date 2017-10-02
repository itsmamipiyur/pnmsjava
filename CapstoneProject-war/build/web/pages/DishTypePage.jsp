<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : DishTypePage
    Created on : 09 26, 17, 1:59:58 PM
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
                        <webuijsf:staticText id="staticText1" style="font-size: 36px; font-weight: bold; left: 360px; top: 96px; position: absolute" text="Dish Type"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 144px; top: 216px; position: absolute" title="Table" width="624">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{SessionBean1.dishTypeArr}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="dishTypeName" id="tableColumn1" sort="dishTypeName">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['dishTypeName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="dishTypeDesc" id="tableColumn2" sort="dishTypeDesc">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['dishTypeDesc']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Update" id="tableColumn3">
                                    <webuijsf:button actionExpression="#{pages$DishTypePage.btnUpdate_action}" id="btnUpdate" text="Select"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Deactivate" id="tableColumn4">
                                    <webuijsf:button actionExpression="#{pages$DishTypePage.btnDeactivate_action}" id="btnDeactivate" text="Select"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:button actionExpression="#{pages$DishTypePage.btnNew_action}" id="btnNew"
                            style="height: 24px; left: 143px; top: 168px; position: absolute; width: 96px" text="New Dish Type"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
