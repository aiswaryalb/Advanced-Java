<%-- 
    Document   : upload
    Created on : Sep 18, 2018, 12:56:53 PM
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
        <%@page import="com.oreilly.servlet.MultipartRequest" %>
        <%
            MultipartRequest m=new MultipartRequest(request,"g:UploadDownload");
            out.print("Successfully Uploaded");
            %>
    </body>
</html>
