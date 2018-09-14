<%-- 
    Document   : welcome
    Created on : Sep 14, 2018, 1:16:26 PM
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
        <% String n=request.getParameter("username");
        out.print("Welcome "+n);
        
        %><br>
        <%= "Hello "+request.getParameter("username") %>
        <br>
        
                
    </body>
</html>
