/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aiswarya
 */
public class FetchData extends HttpServlet {
     public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        try {
            ServletContext ctx=getServletContext();
            Connection con=(Connection) ctx.getAttribute("mycon");
            String query="create table emp33(id int(70),name varchar(20))"; 
                PreparedStatement ps=con.prepareStatement(query);
                ps.executeUpdate();
                System.out.println(query);
            con.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        out.close();
                
    }

    
}