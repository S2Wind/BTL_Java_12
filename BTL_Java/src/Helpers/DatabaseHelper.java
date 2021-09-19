
package Helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseHelper {
    static Connection con;
    public static Connection openConnection() throws Exception
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost:1433;database=quanlytiennuoc;";
        String dbusername = "sa";
        String password = "213213";
        con = DriverManager.getConnection(connectionUrl, dbusername, password);
        return con;
    }
    
    public static Statement getStatement() throws SQLException
    {
        return con.createStatement();
    }
    public static PreparedStatement getPrepareStatement(String sql) throws SQLException
    {
        return con.prepareStatement(sql);
    }
}
