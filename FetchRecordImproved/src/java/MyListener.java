
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.apache.catalina.User;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aiswarya
 */
public class MyListener implements ServletContextListener
{
    public void contextInitialized(ServletContextEvent e)
    {
        ArrayList list=new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            PreparedStatement ps=con.prepareStatement("select * from csuser");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                UserPage u=new UserPage();
                u.setId(rs.getInt(1));
                u.setName(rs.getString(2));
                u.setPassword(rs.getString(3));
                list.add(u);
                
                
                
                
            }
            con.close();
            
        } 
        catch (Exception e2) {
            System.out.println(e2);
        }
        
        ServletContext context=e.getServletContext();
        context.setAttribute("data",list);
        
    }
    public void contextDestroyed(ServletContextEvent e)
    {
        System.out.println("Project undeployed");
    }
    
}
