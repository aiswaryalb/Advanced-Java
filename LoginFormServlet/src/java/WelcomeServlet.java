/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class WelcomeServlet extends HttpServlet {

    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        String n=request.getParameter("username");
        out.print("<br> Welcome "+n);
        out.close();
    }
}