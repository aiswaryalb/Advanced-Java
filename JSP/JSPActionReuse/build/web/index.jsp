<%-- 
    Document   : index
    Created on : Sep 14, 2018, 3:39:17 PM
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
       <form action="process.jsp" method="post">
            Name:<input type="text" name="name"><br><br>
            Password:<input type="password" name="password"><br><br>
            Email:<input type="text" name="email"><br><br>
            <input type="submit" value="Register">
        </form>
        <hr><br> <a href="second.jsp">Visit</a>
    </body>
</html>
