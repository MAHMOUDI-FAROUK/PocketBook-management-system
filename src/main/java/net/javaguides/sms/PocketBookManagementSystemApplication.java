package net.javaguides.sms;

import net.javaguides.sms.entity.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.repository.ExpenseRepository;

@SpringBootApplication
public class PocketBookManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PocketBookManagementSystemApplication.class, args);
	}

	@Autowired
	private ExpenseRepository expenseRepository;
	
	@Override
	public void run(String... args) throws Exception {
		/*Expense expense1 = new Expense("Travel charger","ACDC outlets", 49.95F,"description1");
		Expense expense2 = new Expense("Ukelele","ohana instruments", 128F,"description2");
		Expense expense3 = new Expense("Sunscreen","ABC store", 11.71F,"description3");
		Expense expense4 = new Expense("Huge Plastic","Party city", 77.89F,"description4");
		Expense expense5 = new Expense("4 Manapoa","Manapoa Man", 8F,"description5");*/

		
	}

}
