import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
