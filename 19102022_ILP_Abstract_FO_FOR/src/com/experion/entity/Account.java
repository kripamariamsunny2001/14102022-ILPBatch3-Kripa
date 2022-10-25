package com.experion.entity;

import java.util.ArrayList;

public class Account extends Product {
	private String accounNumber;
	private double accountBalance;
	
	public Account(String productName, String accounNumber, double accountBalance) {
		super(productName);
		this.accounNumber = accounNumber;
		this.accountBalance = accountBalance;
	}
	public String getAccounNumber() {
		return accounNumber;
	}
	public void setAccounNumber(String accounNumber) {
		this.accounNumber = accounNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public void checkProductValidity() {
		System.out.println("Validity check Account class called");
		
	}
	
	
	}
	
	

	

