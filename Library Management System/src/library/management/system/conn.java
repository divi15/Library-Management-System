
package library.management.system;
import java.sql.*;
/**
 *
 * @author DIVYA K
 */
public class conn {
    Connection c;
    Statement s;
    public conn()
    {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        c=DriverManager.getConnection("jdbc:mysql:///project1","root","");
        //e=createStatement();
        }
        catch(Exception e)
                {
                    System.out.println(e);
                }
        
    }
    
}
