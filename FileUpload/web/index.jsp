<%-- 
    Document   : index
    Created on : Sep 14, 2018, 10:03:41 AM
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
        <form action="go" method="post" enctype="multipart/form-data">
            Select file:<input type="file" name="fname"><br>
            <input type="submit" value="Upload">
        </form>
    </body>
</html>
