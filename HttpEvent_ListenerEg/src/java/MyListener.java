/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author Aiswarya
 */
public class MyListener implements HttpSessionListener
{
    ServletContext ctx=null;
    static int total=0,current=0;
    
    public  void sessionCreated(HttpSessionEvent e)
    {
        total++;
        current++;
        
        ctx=e.getSession().getServletContext();
        ctx.setAttribute("totalusers", total);
        ctx.setAttribute("currentusers", current);
        
    }
    public void sessionDestroyed(HttpSessionEvent e)
    {
        current--;
        ctx.setAttribute("currentusers", current);
    }
    
}