<%-- 
    Document   : process
    Created on : Sep 14, 2018, 3:29:51 PM
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
        <jsp:useBean id="u" class="org.sssit.User" scope="session"></jsp:useBean>
        <jsp:setProperty property="*" name="u"/>
        
        Record:<br>
        <jsp:getProperty property="name" name="u"/><br>
        <jsp:getProperty property="password" name="u"/><br>
        <jsp:getProperty property="email" name="u"/><br>
        
        <br> <a href="second.jsp">Visit Page</a>
    </body>
</html>
