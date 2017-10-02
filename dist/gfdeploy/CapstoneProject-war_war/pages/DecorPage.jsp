<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : DecorPage
    Created on : 09 26, 17, 1:32:40 PM
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
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 120px; top: 216px; position: absolute" title="Table" width="696">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{SessionBean1.decorArr}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="Name" id="tableColumn2" sort="decorName">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['decorName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Description" id="tableColumn3" sort="decorDesc">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['decorDesc']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Type" id="tableColumn7" sort="decorTypeName">
                                    <webuijsf:staticText id="staticText6" text="#{currentRow.value['decorTypeName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Update" id="tableColumn5" valign="middle">
                                    <webuijsf:button actionExpression="#{pages$DecorPage.btnUpdate_action}" id="btnUpdate" text="Select"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Deactivate" id="tableColumn6" valign="middle">
                                    <webuijsf:button actionExpression="#{pages$DecorPage.btnDeactivate_action}" id="btnDeactivate" text="Select"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:button actionExpression="#{pages$DecorPage.btnNew_action}" id="btnNew"
                            style="height: 24px; left: 119px; top: 168px; position: absolute; width: 96px" text="New Decor"/>
                        <webuijsf:staticText id="staticText4" style="font-size: 36px; font-weight: bold; left: 408px; top: 72px; position: absolute" text="DECOR"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
