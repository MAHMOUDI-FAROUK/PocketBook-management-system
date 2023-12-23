package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Expense;

public interface ExpenseService {
	List<Expense> getAllExpenses();
	
	Expense saveExpense(Expense expense);
	
	Expense getExpenseById(Long id);
	
	Expense updateExpense(Expense expense);
	
	void deleteExpenseById(Long id);
}
