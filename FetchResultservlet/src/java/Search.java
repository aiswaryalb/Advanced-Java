/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aiswarya
 */
public class Search extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        String rollno=request.getParameter("roll");
        int roll=Integer.parseInt(rollno);
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            PreparedStatement ps=con.prepareStatement("select * from result where ROLLNO=?");
            ps.setInt(1, roll);
            out.print("<table width=50% border=1");
            out.print("<caption>Result:</caption>");
            
            ResultSet rs=ps.executeQuery();
            
            
            	ResultSetMetaData rsmd=rs.getMetaData();  
	int total=rsmd.getColumnCount();  
	out.print("<tr>");  
	for(int i=1;i<=total;i++)  
	{  
	out.print("<th>"+rsmd.getColumnName(i)+"</th>");  
	}  
	  
	out.print("</tr>");  
        
        while(rs.next())
        {
            out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");
            
        
        }
        out.print("</table>");
            
        } catch (Exception e2) {e2.printStackTrace();
            
        }
        finally{
            out.close();
        }
    }
}