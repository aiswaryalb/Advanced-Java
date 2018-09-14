<%-- 
    Document   : error
    Created on : Sep 14, 2018, 1:28:38 PM
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
        <%@page isErrorPage="true" %>
        <h3>Sorry Exception occurred!</h3><br>
       Exception is : <%= exception %>
    </body>
</html>
