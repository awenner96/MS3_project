import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//I have never before interacted with creating an SQLite table using Java, so I found a tutorial and wrote this based off of it.
//After creating the SQLiteConnect class I wasn't sure it was necessary because it looks like one just uses this a simple try connection
//statement here to connect to the database.
//However, even with only labeling one primary key field, I couldn't get anything to show up.

public class TableSetter {
    public static void tablecreator(){
        String url = "jdbc:sqlite:C://";
        String sql = "Create Table If Not Exists interview data (\n" + "lastname text PRIMARY KEY, \n";

        try(Connection connect = DriverManager.getConnection(url);
            Statement stmt = connect.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args){
        tablecreator();
    }
}
