<%-- 
    Document   : index
    Created on : Sep 14, 2018, 10:42:07 AM
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
        <form action="servlet1" method="post">
            Name:<input type="text" name="username"><br><br>
            Password:<input type="password" name="userpass"><br><br>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
