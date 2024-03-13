package com.xmoney.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/xmoney";
        String username = "root";
        String password = "root";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println(connection);
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        return null;
    }
}
