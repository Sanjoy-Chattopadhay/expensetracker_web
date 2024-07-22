package com.example.service;

import com.example.dao.ExpenseDAO;
import com.example.model.Expense;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExpenseService {
    private ExpenseDAO expenseDAO = new ExpenseDAO();

    public List<Expense> getAllExpenses() {
        List<Expense> expenses = new ArrayList<>();
        try (Connection connection = expenseDAO.getConnection()) {
            // Code to retrieve expenses from the database
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return expenses;
    }
}
