package com.example.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=expense_tracker;";
        // Use Integrated Security for Windows Authentication
        return DriverManager.getConnection(url);
    }
}
