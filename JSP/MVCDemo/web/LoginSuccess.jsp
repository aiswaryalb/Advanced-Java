<%-- 
    Document   : LoginSuccess
    Created on : Sep 17, 2018, 10:29:52 AM
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
        <%@page import="com.javatpoint.LoginBean" %>
        <p>You are successfully logged in !! </p><br><br>
        <%
            LoginBean bean=(LoginBean)request.getAttribute("bean");
            out.print("Welcome "+bean.getName());
            %>
    </body>
</html>
