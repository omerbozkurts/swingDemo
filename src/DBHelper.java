
import java.sql.*;

public class DBHelper {
    private String userName="root";
    private String passWord="sifre";
    private String dbUrl="jdbc:mysql://localhost:3306/world";
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl,userName,passWord);
    }
    public void showErrorMessage(SQLException exception){
        System.out.println(exception.getMessage());
    }
}
