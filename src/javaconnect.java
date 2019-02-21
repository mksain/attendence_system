import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect
{
    Connection conn=null;
    
    public static Connection ConnectDB()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:attendencesystem.sqlite");
            return conn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
