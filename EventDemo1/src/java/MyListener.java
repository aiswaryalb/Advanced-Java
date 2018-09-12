/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aiswarya
 */
public class MyListener implements ServletContextListener
{
    public void contextInitialized(ServletContextEvent event)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");

                ServletContext ctx=event.getServletContext();
                ctx.setAttribute("mycon", con);
                
                
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void contextDestroyed(ServletContextEvent event){
        
    }
}