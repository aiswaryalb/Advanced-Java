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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Aiswarya
 */
public class First extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        String n=request.getParameter("username");
        out.print("Welcome "+n);
        
        HttpSession session=request.getSession();
        session.setAttribute("uname", n);
        
        ServletContext ctx=getServletContext();
        int t=(Integer) ctx.getAttribute("totalusers");
        int c=(Integer) ctx.getAttribute("currentusers");
        
        out.print("<br> Total users = "+t);
        out.print("<br> Current users = "+c);
        
        out.print("<br> <a href='Logout'>Logout</a>");
        out.close();
        
    }

}