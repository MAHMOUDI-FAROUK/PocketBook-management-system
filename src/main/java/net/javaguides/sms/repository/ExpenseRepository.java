package net.javaguides.sms.repository;

import net.javaguides.sms.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
