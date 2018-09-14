<%-- 
    Document   : process
    Created on : Sep 14, 2018, 1:28:27 PM
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
        
        <% 
            String num1=request.getParameter("n1");
            String num2=request.getParameter("n2");
            int a=Integer.parseInt(num1);
            int b=Integer.parseInt(num2);
            int c=a/b;
            out.print("Quotient is "+c);
            
        %>
    </body>
</html>
