<%-- 
    Document   : index
    Created on : Sep 18, 2018, 10:50:22 AM
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
        <form action="process.jsp" >
            <input type="text" name="uname" value="Name..." onclick="this.value=''"/><br>
            <input type="text" name="uemail" value="Email..." onclick="this.value=''"/><br>
            <input type="password" name="upass" value="Password..." onclick="this.value=''"><br>
            
            <input type="submit" value="Register">
        </form>
    </body>
</html>
