<%-- 
    Document   : index
    Created on : Sep 17, 2018, 10:11:40 AM
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
        <h3>Welcome to index page</h3>
        <form action="process.jsp">
        Name:<input type="text" name="name">
        <input type="submit" value="Go"></form>
        <% session.setAttribute("user", "Surya");%>
    </body>
</html>
