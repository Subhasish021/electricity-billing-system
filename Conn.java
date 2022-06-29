package electricity.billing.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    Conn()
    {
        try
        {
          //Register the jdbc driver  
      Class.forName("com.mysql.cj.jdbc.Driver");
      //Getting the connection
      c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs2","root","Vsc std 21");
      s=c.createStatement();
        }
        
       catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String ars[])
    {
        new Conn();
        
    }
}