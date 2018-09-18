<%-- 
    Document   : download
    Created on : Sep 18, 2018, 1:08:25 PM
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
	  String filename = "home.jsp";   
	  String filepath = "g:\\";   
	  response.setContentType("APPLICATION/OCTET-STREAM");   
	  response.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\"");   
	  
	  java.io.FileInputStream fileInputStream=new java.io.FileInputStream(filepath + filename);  
	            
	  int i;   
	  while ((i=fileInputStream.read()) != -1) {  
	    out.write(i);   
	  }   
	  fileInputStream.close();   
	%>   

    </body>
</html>
