/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_Admission;


import java.sql.*;
/**
 *
 * @author HNDX
 */
public class DBClass {
    static private  Connection connection;
    public static Connection getConnection() throws Exception
    {
        if(connection==null)
            {Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","1234");
        } 
        return connection;
    }
}
