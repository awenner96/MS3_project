import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//This along with the tablecreator I had to view tutorials in order to come up with the code.
//I wasn't sure how to initialize the database even after downloading the appropriate drivers onto my desktop computer.
//File structure, code, or both was wrong and I never managed to get anything running.

public class SQLiteConnect {
    public static void main(String[] args){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("some.database");
        }
        catch(SQLException e){
            System.err.println(e.getMessage());
        }
        try {
            if(connection != null)
                connection.close();
        }
        catch(SQLException e){
            System.err.println(e.getMessage());
        }
    }
}
