<%-- 
    Document   : deleteuser
    Created on : Sep 17, 2018, 4:17:06 PM
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
        <%@page  import="com.javatpoint.Dao.UserDao" %>
        <jsp:useBean id="u" class="com.javatpoint.bean.User"></jsp:useBean>
        <jsp:setProperty property="*" name="u"/>
        <%
            UserDao.delete(u);
            response.sendRedirect("viewusers.jsp");
            
            %>
    </body>
</html>
