/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aiswarya
 */
public class DemoServlet1 extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        PrintWriter out=response.getWriter();
        	try {
            response.setContentType("text/html"); 
                
        
                ServletContext context=getServletContext();
                context.setAttribute("company", "IBM");
                out.println("Welcome to first servlet");
                out.println("<a href='servlet2'>visit</a>");  
                out.close();  

                
        }
                catch (Exception e) {
                    
                    out.println(e);
        }
                
    }
}