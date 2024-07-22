package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=ExpenseTrackerDB";
    private static final String USER = "";  // Leave empty for Windows Authentication
    private static final String PASSWORD = "";  // Leave empty for Windows Authentication

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
