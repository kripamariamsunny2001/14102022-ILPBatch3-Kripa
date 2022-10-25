package com.experion.entity;

import com.experion.service.LoanService;
import com.experion.service.Product;

public class Loan extends Product implements LoanService {
	private String LoanNumber;
	private double LoanBalance;
	public Loan(String productName, String loanNumber, double loanBalance) {
		super(productName);
		LoanNumber = loanNumber;
		LoanBalance = loanBalance;
	}
	public String getLoanNumber() {
		return LoanNumber;
	}
	public void setLoanNumber(String loanNumber) {
		LoanNumber = loanNumber;
	}
	public double getLoanBalance() {
		return LoanBalance;
	}
	public void setLoanBalance(double loanBalance) {
		LoanBalance = loanBalance;
	}
	@Override
	public void checkProductValidity() {
		System.out.println("Validity check Loan class called");
		
	}
	@Override
	public void checkDueDate() {
		System.out.println("Check Due date");
		
	}
	@Override
	public void approveLoan() {
		System.out.println("Loan Approved");
	}
	
	
	
	}
	
	

	

