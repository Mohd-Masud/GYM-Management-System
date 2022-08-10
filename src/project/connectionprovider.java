/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;

//import java.sql.DriverManager;

/**
 *
 * @author Masud
 */
public class connectionprovider {
    public static Connection getcon()
    {
        try
        {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gms","root","12345678");
          return con;
        
        }
        catch(Exception e)
        {
        return null;
        }
    }
        
    }
    
    

