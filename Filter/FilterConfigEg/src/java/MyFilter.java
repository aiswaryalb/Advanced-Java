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
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Aiswarya
 */
public class MyFilter implements Filter {
 
    FilterConfig config;
    public void init(FilterConfig config)throws ServletException
    {
        this.config=config;
    }
    public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws IOException,ServletException
    {
        PrintWriter out=res.getWriter();
        
        String c=config.getInitParameter("construction");
        if(c.equals("yes"))
        {
            out.print("<br> Page is under construction");
        }
        else
        {
            chain.doFilter(req, res);
        }
    }
    public void destroy() {        
    }

}