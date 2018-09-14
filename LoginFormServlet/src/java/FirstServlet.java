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
public class FirstServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        String n=request.getParameter("username");
        String p=request.getParameter("userpass");
        
        if(LoginDao.validate(n,p))
        {
            request.getRequestDispatcher("servlet2").forward(request, response);
            
        }
        else
        {
            out.print("Sorry wrong username or password");
            request.getRequestDispatcher("index.jsp").include(request, response);
        }
    }   
}