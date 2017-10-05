<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : RentalPackagePage
    Created on : 10 5, 17, 1:15:22 AM
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
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 120px; top: 192px; position: absolute" title="Table" width="889">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{SessionBean1.rentalPackageArr}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="Name" id="tableColumn1" sort="rentalPackageName" width="233">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['rentalPackageName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Description" id="tableColumn2" sort="rentalPackageDesc" width="138">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['rentalPackageDesc']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Amount" id="tableColumn3" sort="amount" width="118">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['amount']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Update" id="tableColumn4" width="200">
                                    <webuijsf:button id="button1" text="Update"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Delete" id="tableColumn5" width="200">
                                    <webuijsf:button id="button2" text="Delete"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:staticText id="staticText3"
                            style="font-size: 36px; font-weight: bold; left: 288px; top: 48px; position: absolute; width: 397px" text="RENTAL PACKAGE"/>
                        <webuijsf:button actionExpression="#{pages$RentalPackagePage.btnNew_action}" id="btnNew"
                            style="height: 24px; left: 119px; top: 144px; position: absolute; width: 120px" text="New Rental Package"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
