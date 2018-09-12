/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aiswarya
 */
public class FirstServlet extends HttpServlet {

    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        try {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            
            String n=request.getParameter("userName");
            out.println("Welcome "+n);
            
            Cookie ck=new Cookie("uname", n);
            response.addCookie(ck);
            
           out.print("<form action='servlet2' method='post'>");
            out.print("<input type='submit' value='Go'>");
            out.print("</form>");
            
            out.close();
            
            
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        
    }
}