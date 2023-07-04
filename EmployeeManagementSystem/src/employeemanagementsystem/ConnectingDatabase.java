
package employeemanagementsystem;
import java.sql.*;

public class ConnectingDatabase {
    
    Connection c;
    Statement s;

    public ConnectingDatabase(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagmentsystem", "root","Sanjid#191");
            s = c.createStatement();
 
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
