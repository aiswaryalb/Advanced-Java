/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOError;
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
public class LoginServlet extends HttpServlet {
    public void  doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        request.getRequestDispatcher("link.html").include(request, response);
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        
        if(password.equals("admin123"))
        {
            out.print("Welcome "+name);
            HttpSession session =request.getSession();
            session.setAttribute("name", name);
            
            
        }
        else
        {
            out.print("Sorry incorrect password");
            request.getRequestDispatcher("login.html").include(request, response);
        }
        out.close();
    }

}