package net.javaguides.sms.service.impl;

import java.util.List;

import net.javaguides.sms.entity.Expense;
import org.springframework.stereotype.Service;

import net.javaguides.sms.repository.ExpenseRepository;
import net.javaguides.sms.service.ExpenseService;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	private ExpenseRepository expenseRepository;
	
	public ExpenseServiceImpl(ExpenseRepository expenseRepository) {
		super();
		this.expenseRepository = expenseRepository;
	}

	@Override
	public List<Expense> getAllExpenses() {
		return expenseRepository.findAll();
	}

	@Override
	public Expense saveExpense(Expense expense) {
		return expenseRepository.save(expense);
	}

	@Override
	public Expense getExpenseById(Long id) {
		return expenseRepository.findById(id).get();
	}

	@Override
	public Expense updateExpense(Expense expense) {
		return expenseRepository.save(expense);
	}

	@Override
	public void deleteExpenseById(Long id) {
		expenseRepository.deleteById(id);
	}

}
