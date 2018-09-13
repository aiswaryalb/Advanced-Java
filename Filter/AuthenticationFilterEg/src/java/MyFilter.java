/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Aiswarya
 */
public class MyFilter implements Filter {
 
    public void init(FilterConfig arg0)throws ServletException
    {
        
    }
    public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws IOException,ServletException
    {
        PrintWriter out=res.getWriter();
        
        String pass=req.getParameter("password");
        if(pass.equals("admin"))
        {
            chain.doFilter(req, res);
        }
        else
        {
            out.print("Wrong password ");
            RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
            rd.include(req, res);
        }
                
    }
    public void destroy()
{

}
}