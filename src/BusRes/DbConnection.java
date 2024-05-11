package BusRes;

import java.sql.*;

public class DbConnection {
    private static String url = "jdbc:mySql://localhost:3306/busrev";
    private  static String userName = "root";
    private static String passWord = "2907";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, userName, passWord);

    }

}
