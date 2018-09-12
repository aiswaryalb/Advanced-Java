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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Aiswarya
 */
public class ProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        request.getRequestDispatcher("link.html").include(request, response);
        HttpSession session=request.getSession(false);
        if(session!=null)
        {
            String name=(String) request.getAttribute("name");
            out.print("Hello, "+name+" Welcome to Profile");  
            
        }
        else
        {
            out.print("Please login first");  
            request.getRequestDispatcher("login.html").include(request, response);
        }
        out.close();
    }
}