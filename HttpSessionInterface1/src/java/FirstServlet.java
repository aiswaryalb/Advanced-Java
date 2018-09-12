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
public class FirstServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        try {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            
            String n=request.getParameter("userName");
            out.print("Welcome "+n);
            
            HttpSession session=request.getSession();
            session.setAttribute("uname", n);
            
            out.print("<br><a href='servlet2'>Visit</a>");
            out.close();
            
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}