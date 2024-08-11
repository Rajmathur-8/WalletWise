package com.spring.WalletWise.services.expense;

import com.spring.WalletWise.dto.ExpenseDTO;
import com.spring.WalletWise.entity.Expense;

import java.util.List;

public interface ExpenseService {
    Expense postExpense(ExpenseDTO expenseDTO);

    List<Expense> getAllExpenses();
    Expense getExpenseById(Long id);
    Expense updateExpense(Long id,ExpenseDTO expenseDTO);
    void deleteExpense(Long id);
}
