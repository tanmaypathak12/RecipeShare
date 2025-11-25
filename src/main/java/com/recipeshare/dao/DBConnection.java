package com.recipeshare.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // Option A (recommended): dedicated DB user created by the SQL script
    private static final String URL = "jdbc:mysql://localhost:3306/recipeshare?useSSL=false&serverTimezone=UTC";
    private static final String USER = "recipeshareuser";
    private static final String PASS = "StrongPassword123";

    // If you want to use root (not recommended), change USER="root" and PASS="bhulgaye97099"

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
