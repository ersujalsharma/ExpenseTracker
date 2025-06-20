package com.sujal.expensetracker.expense_tracker.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsService {
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException;
}
