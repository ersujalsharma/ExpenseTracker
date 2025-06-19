package com.sujal.expensetracker.expense_tracker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sujal.expensetracker.expense_tracker.data.AuthResponse;
import com.sujal.expensetracker.expense_tracker.data.LoginRequest;
import com.sujal.expensetracker.expense_tracker.data.RegisterRequest;
import com.sujal.expensetracker.expense_tracker.service.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
	 private final AuthService authService;

	    @PostMapping("/register")
	    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest req) {
	        return ResponseEntity.ok(authService.register(req));
	    }

	    @PostMapping("/login")
	    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest req) {
	        return ResponseEntity.ok(authService.login(req));
	    }
}
