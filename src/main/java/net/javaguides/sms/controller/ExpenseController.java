package net.javaguides.sms.controller;

import net.javaguides.sms.entity.Expense;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.sms.service.ExpenseService;

@Controller
public class ExpenseController {
	
	private ExpenseService expenseService;

	public ExpenseController(ExpenseService expenseService) {
		super();
		this.expenseService = expenseService;
	}
	
	// handler method to handle list expenses and return mode and view
	@GetMapping("/expenses")
	public String listExpenses(Model model) {
		model.addAttribute("expenses", expenseService.getAllExpenses());
		return "expenses";
	}
	
	@GetMapping("/expenses/new")
	public String createExpenseForm(Model model) {
		
		// create Expense object to hold Expense form data
		Expense expense = new Expense();
		model.addAttribute("expense", expense);
		return "create_expense";
		
	}
	
	@PostMapping("/expenses")
	public String saveExpense(@ModelAttribute("expense") Expense expense) {
		expenseService.saveExpense(expense);
		return "redirect:/expenses";
	}
	
	@GetMapping("/expenses/edit/{id}")
	public String editExpenseForm(@PathVariable Long id, Model model) {
		model.addAttribute("expense", expenseService.getExpenseById(id));
		return "edit_expense";
	}

	@PostMapping("/expenses/{id}")
	public String updateExpense(@PathVariable Long id,
			@ModelAttribute("expense") Expense expense,
			Model model) {
		
		// get expense from database by id
		Expense existingExpense = expenseService.getExpenseById(id);
		existingExpense.setId(id);
		existingExpense.setName(expense.getName());
		existingExpense.setVendor(expense.getVendor());
		existingExpense.setAmount(expense.getAmount());
		existingExpense.setDescription(expense.getDescription());
		
		// save updated expense object
		expenseService.updateExpense(existingExpense);
		return "redirect:/expenses";
	}
	
	// handler method to handle delete expense request
	
	@GetMapping("/expenses/{id}")
	public String deleteExpense(@PathVariable Long id) {
		expenseService.deleteExpenseById(id);
		return "redirect:/expenses";
	}
	
}
