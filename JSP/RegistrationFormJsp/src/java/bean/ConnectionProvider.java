/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import static bean.Provider.*;

/**
 *
 * @author Aiswarya
 */
public class ConnectionProvider {
    private static Connection con=null;
    static 
    {
        try {
            Class.forName(DRIVER);
            con= DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);
            
        } catch (Exception e) {
        }
    }
    public static Connection getCon()
    {
        return con;
    }
    
}
