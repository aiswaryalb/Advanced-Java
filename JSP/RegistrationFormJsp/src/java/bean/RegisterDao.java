/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Aiswarya
 */
public class RegisterDao {
    
    public static  int register(User u)
    {
        int status=0;
        try {
            Connection con=ConnectionProvider.getCon();
            PreparedStatement ps=con.prepareStatement("insert into user432 values(?,?,?)");
            ps.setString(1, u.getUname());
            ps.setString(2, u.getUemail());
            ps.setString(3, u.getUpass());
            status=ps.executeUpdate();
        } catch (Exception e) {
        }
        return status;
    }
    
    
}
