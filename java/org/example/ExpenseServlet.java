package org.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addExpense")
public class ExpenseServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ExpenseDAO expenseDAO = new ExpenseDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        double amount = Double.parseDouble(request.getParameter("amount"));
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));

        expenseDAO.addExpense(name, amount, categoryId);

        response.sendRedirect("index.html");
    }
}
