package mess_feedbacksystem;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anurag
 */
public class DatabaseConnectivity {
    private String db_name;
    private String db_username;
    private String db_password;
    private String url;
    private Connection connection;
    private Statement statement;
    
   //user must pass database name ,database username and password as agrument to object;
   
    public DatabaseConnectivity(String db,String usr,String pass){
        this.statement = null;
        this.connection = null;
        System.out.println("dc constructor");
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            System.out.println("driver registerd");
            url="jdbc:mysql://localhost:3306/";
            db_name=db;
            db_username=usr;
            db_password=pass;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnectivity.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Statement makeConnection(){
        try {
            connection=(Connection) DriverManager.getConnection(url+db_name,db_username,db_password);
            System.out.println("connection");
            statement=(Statement) connection.createStatement();
            System.out.println("statement");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnectivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            System.out.println("Hurreeeee");
            return statement;
        }
    }
    //@Override
    //protected finalize() throws SQLException{
      //  connection.close();
        //statement.close();
    //}
}
