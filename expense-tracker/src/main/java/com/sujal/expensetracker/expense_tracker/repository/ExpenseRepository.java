package com.sujal.expensetracker.expense_tracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sujal.expensetracker.expense_tracker.model.Expense;
import com.sujal.expensetracker.expense_tracker.model.User;

public interface ExpenseRepository extends JpaRepository<Expense, Long>{
	List<Expense> findByUser(User user);
}
