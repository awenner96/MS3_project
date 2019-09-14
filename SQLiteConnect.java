import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
