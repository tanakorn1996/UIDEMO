package dbUtil;

import jdk.internal.org.objectweb.asm.ClassReader

import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnection {
    private static final String SQCONN = "jdbc:sqlite:mit.sqlite";


    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(SQCONN);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;


    }


    private static class SQLException extends Exception {
    }
}//class
