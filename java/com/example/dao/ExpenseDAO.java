package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExpenseDAO {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=ExpenseTracker";
    private static final String USER = "";
    private static final String PASSWORD = "";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
