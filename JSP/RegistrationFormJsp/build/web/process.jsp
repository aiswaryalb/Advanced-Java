<%-- 
    Document   : process
    Created on : Sep 18, 2018, 11:03:43 AM
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
        <%@page  import="bean.RegisterDao" %>
        <jsp:useBean id="obj" class="bean.User"/>
        <jsp:setProperty property="*" name="obj"></jsp:setProperty>
        
        <%
            int status=RegisterDao.register(obj);
            if(status>0)
            {
                out.print("You are successfully registered");
            }
        %>
        
    </body>
</html>
