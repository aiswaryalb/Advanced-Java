<%-- 
    Document   : adduser
    Created on : Sep 17, 2018, 3:15:14 PM
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
        <%@page import="com.javatpoint.Dao.UserDao" %>
        <jsp:useBean id="u" class="com.javatpoint.bean.User" ></jsp:useBean>
        <jsp:setProperty property="*" name="u"/>
        <%
            int i=UserDao.save(u);
            if(i>0)
            {
                response.sendRedirect("adduser-success.jsp");
                
            }
            else
            {
                 response.sendRedirect("adduser-error.jsp");
            }
            
            %>
    </body>
</html>
