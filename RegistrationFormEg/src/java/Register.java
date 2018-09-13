/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aiswarya
 */
public class Register extends HttpServlet {

    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        String n=request.getParameter("userName");
        String p=request.getParameter("userPass");
        String e=request.getParameter("userEmail");
        String c=request.getParameter("userCountry");
        
        try {
            
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            PreparedStatement ps=con.prepareStatement("insert into registeruser values(?,?,?,?)");
            ps.setString(1, n);
            ps.setString(2, p);
            ps.setString(3, e);
            ps.setString(4, c);
            
            int x=ps.executeUpdate();
            if(x>0)
            {
                out.print("Successfully registered");
            }
        } 
        catch (Exception e1) {
            System.out.println(e1);
            
        }
        out.close();
    }
}