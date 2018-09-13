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
public class HelloServlet extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
    res.setContentType("text/html");
    PrintWriter out=res.getWriter();
    
    out.print("<br>Welcome to servlet<br>");
}

}