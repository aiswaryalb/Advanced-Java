/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aiswarya
 */
public class DownloadServlet extends HttpServlet {
 
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        
        String filename="home.jsp";
        String filepath="g:\\";
        response.setContentType("APPLICATION/OCTET-STREAM");
        response.setHeader("Content-Disposition", "attachment;filename=\""+filename+"/");
        
        FileInputStream fileInputStream=new FileInputStream(filepath + filename);
        
        int i;
        while((i=fileInputStream.read())!=-1)
        {
            out.write(i);
        }
        fileInputStream.close();
        out.close();
    }
}