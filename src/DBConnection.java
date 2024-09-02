import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dbConnection;
    private static Connection connection;

    private DBConnection() throws SQLException{
        connection = DriverManager.getConnection("url", "username", "password");
    }

    public static Connection getConnection() throws SQLException{
        if(dbConnection == null){
            dbConnection = new DBConnection();
        }
        return connection;
    }
}
