<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : menu
    Created on : 09 23, 17, 8:24:05 AM
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
                        <webuijsf:hyperlink actionExpression="#{pages$AdminMenu.eventType_action}" id="eventType"
                            style="font-size: 18px; left: 0px; top: 192px; position: absolute" text="EventType"/>
                        <webuijsf:hyperlink actionExpression="#{pages$AdminMenu.item_action}" id="item"
                            style="font-size: 18px; left: 0px; top: 96px; position: absolute" text="Item"/>
                        <webuijsf:hyperlink actionExpression="#{pages$AdminMenu.decor_action}" id="decor"
                            style="font-size: 18px; left: 0px; top: 216px; position: absolute" text="Decor"/>
                        <webuijsf:hyperlink actionExpression="#{pages$AdminMenu.dishType_action}" id="dishType"
                            style="font-size: 18px; left: 0px; top: 120px; position: absolute" text="Dish Type"/>
                        <webuijsf:hyperlink actionExpression="#{pages$AdminMenu.dish_action}" id="dish"
                            style="font-size: 18px; left: 0px; top: 144px; position: absolute" text="Dish"/>
                        <webuijsf:hyperlink actionExpression="#{pages$AdminMenu.cateringPackage_action}" id="cateringPackage"
                            style="font-size: 18px; left: 0px; top: 168px; position: absolute" text="Catering Package"/>
                        <webuijsf:hyperlink actionExpression="#{pages$AdminMenu.rentalPackage_action}" id="rentalPackage"
                            style="font-size: 18px; left: 0px; top: 240px; position: absolute" text="Rental Package"/>
                        <webuijsf:hyperlink actionExpression="#{pages$AdminMenu.delivery_action}" id="delivery"
                            style="font-size: 18px; left: 0px; top: 264px; position: absolute" text="Delivery"/>
                        <webuijsf:panelLayout id="layoutPanel1" panelLayout="flow" style="height: 70px; left: 0px; top: 0px; position: absolute; width: 694px">
                            <webuijsf:label id="label1" style="font-family: 'Times New Roman',Times,serif; font-size: XX-large" text="PNMS"/>
                        </webuijsf:panelLayout>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
