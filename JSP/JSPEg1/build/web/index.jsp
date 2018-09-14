<%-- 
    Document   : index
    Created on : Sep 14, 2018, 1:11:52 PM
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
        <% out.print(2*5); %><br>
        <form action="welcome.jsp">
           Enter Name: <input type="text" name="username"><br>
            <input type="submit" value="Submit">
        </form>
        <%! int d=50;%>
        <%= "Value of d is "+d%>
        
        <%! int cube(int n){
            return n*n*n;
        }
        %><br>
        <%= "Cube of 3 is "+cube(3)%>
        <br>
        
       
    </body>
</html>
