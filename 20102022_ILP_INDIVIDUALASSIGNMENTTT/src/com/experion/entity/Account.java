package com.experion.entity;

public class Account {
	private String accountNumber;
	private double accountBalance;
	private String accountType;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Account(String accountNumber, double accountBalance, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
	}

}
