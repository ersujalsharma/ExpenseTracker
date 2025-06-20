package com.sujal.expensetracker.expense_tracker.data;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RegisterRequest {
	@NotBlank
	private String name;
	@Email
	private String email;
	@NotBlank
	private String password;
}
