package sample;

import dbUtil.dbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class loginModel {

    Connection connection;
    //constructor
    public loginModel(){
        try {
            this.connection = dbConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (this.connection ==null) System.exit(1);
    }

    public boolean isDatabaseConnection(){
        return this.connection != null;
    }

    public boolean isLogin(String)
        PreparedStatement pr = null;
        ResultSet rs = null;

        String sql = "select * from admin where username"
        try {
            pr = this.connection.prepareCall(sql);
            pr.setString(i:1,username);
    }


}//class
