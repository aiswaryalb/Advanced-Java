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
            PreparedStatement ps=con.prepareStatement("select * from student",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                out.print("<br>"+rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  ");
            }
            
            con.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        out.close();
                
    }

}