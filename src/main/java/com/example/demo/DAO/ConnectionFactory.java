package com.example.demo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String DB_USER_NAME = "root";
    private static final String DB_USER_PASS = "root";
    static{
        try{
            Class.forName( "com.mysql.cj.jdbc.Driver").newInstance();
        } catch(Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3307/anim_bd?serverTimezone=UTC";
        return DriverManager.getConnection(url, DB_USER_NAME, DB_USER_PASS);
    }
}
