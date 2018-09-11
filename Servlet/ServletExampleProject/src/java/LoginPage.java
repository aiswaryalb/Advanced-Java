/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

/**
 *
 * @author Aiswarya
 */
public class LoginPage extends HttpServlet {

    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        String n=request.getParameter("userName");
        String p=request.getParameter("userPass");
        
        if(p.equals("servlet"))
        {
            RequestDispatcher rd=request.getRequestDispatcher("servlet2");
           rd.forward(request, response);
        }
        else
        {
            out.print("Sorry wrong password or username");
            RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
            rd.include(request, response);
        }
        
        
        
    }
}