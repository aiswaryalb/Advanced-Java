/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aiswarya
 */
public class MyServlet2 extends HttpServlet {
    public void  doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        long before=System.currentTimeMillis();
        
        ServletContext context=getServletContext();
        List list=(List) context.getAttribute("data");
        
        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
            UserPage u=(UserPage) itr.next();
            out.print("<br>"+u.getId()+"  "+u.getName()+"  "+u.getPassword());
            
            
        }
        long after=System.currentTimeMillis();
        out.print("<br>Total time : "+(after-before));
        out.close();
    }
}