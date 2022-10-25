package com.bank.entity;

public class Account extends Product {
	
	private double accountBalance;

	public Account(String productName, double accountBalance) {
		super(productName);
		this.accountBalance = accountBalance;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	

}
