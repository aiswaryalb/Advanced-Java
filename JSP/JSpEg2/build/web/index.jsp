<%-- 
    Document   : index
    Created on : Sep 14, 2018, 3:02:40 PM
    Author     : Aiswarya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.html" %>
        Today is :<%= java.util.Calendar.getInstance().getTime() %>
    </body>
</html>
