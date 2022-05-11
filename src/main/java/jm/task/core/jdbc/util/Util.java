package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final static String URL = "jdbc:MySQL://localhost:3306/users";
    private final static String USERNANE = "root";
    private final static String PASSWORD = "fkm,byfA1212";
    private static Connection connection;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); //ненависть
            connection = DriverManager.getConnection(URL, USERNANE, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
