<%-- 
    Document   : index
    Created on : Sep 7, 2018, 12:21:05 PM
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
            Name:<input type="text" name="userName"><br>
            Password:<input type="password" name="userPass"><br>
            <input type="submit" value="login">
        </form>
    </body>
</html>
