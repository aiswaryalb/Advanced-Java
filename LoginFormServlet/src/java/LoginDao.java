
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aiswarya
 */
public class LoginDao {

   public static boolean validate(String n, String p) {
       boolean status=false;
       try {
           Class.forName("com.mysql.jdbc.Driver");
            Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            PreparedStatement ps=con.prepareStatement("select * from csuser where name=? and password=?");
            ps.setString(1, n);
            ps.setString(2, p);
            ResultSet rs=ps.executeQuery();
            status=rs.next();
           
       } 
       catch (Exception e) {
           System.out.println(e);
       }
       return status;
        
    }
    
}
