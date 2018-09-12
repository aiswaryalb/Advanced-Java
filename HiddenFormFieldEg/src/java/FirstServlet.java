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
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        try {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            
            String n=request.getParameter("userName");
            out.print("hello "+n);
            
            out.print("<form action='servlet2' >");
            out.print("<input type='hidden' name='uname' value='"+n+"'>");
            out.print("<input type='submit' value='Go'");
            out.print("</form>");
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}