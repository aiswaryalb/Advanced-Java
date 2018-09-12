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
public class SecondServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        try {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            
            HttpSession session=request.getSession();
            String n=(String) session.getAttribute("uname");
            out.print("Hello "+n);
            out.close();
        } catch (Exception e) {
        }
    }

}