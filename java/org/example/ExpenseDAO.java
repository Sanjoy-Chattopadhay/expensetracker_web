package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExpenseDAO {

    public void addExpense(String name, double amount, int categoryId) {
        String sql = "INSERT INTO Expenses (ExpenseName, Amount, CategoryID) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setDouble(2, amount);
            stmt.setInt(3, categoryId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Add methods to get expenses, delete expenses, etc.
}
