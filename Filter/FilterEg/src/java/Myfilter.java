/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aiswarya
 */

public class Myfilter implements Filter
{
    public  void init(FilterConfig arg0)throws ServletException{
        
    }
    public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws IOException,ServletException
    {
        PrintWriter out=res.getWriter();
        out.print("Filter is invoked before");
        
        chain.doFilter(req, res);
        out.print("Filter is invoked after");
        out.close();
        
    }
    public  void destroy(){}
}