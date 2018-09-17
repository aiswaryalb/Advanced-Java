<%-- 
    Document   : process
    Created on : Sep 17, 2018, 10:14:11 AM
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
        Welcome ,${param.name}
        <br>
        Value is ${sessionScope.user}
    </body>
</html>
