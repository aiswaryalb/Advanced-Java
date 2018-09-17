package com.javatpoint;

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
public class ControllerServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        String n=request.getParameter("name");
        String p=request.getParameter("password");
        
        LoginBean bean =new LoginBean();
        bean.setName(n);
        bean.setPassword(p);
        request.setAttribute("bean", bean);
        
        boolean status=bean.validate();
        
        if(status)
        {
            request.getRequestDispatcher("LoginSuccess.jsp").forward(request, response);
        }
        else
        {
            request.getRequestDispatcher("LoginError.jsp").forward(request, response);
        }
        
    }
}