package com.bank.entity;

public class Account extends Product 
{
	
	private String accountCode;
	private String accountType;
	private double accountBalance;
	public Account(String productName, String accountCode, String accountType, double accountBalance) {
		super(productName);
		this.accountCode = accountCode;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public Account cashDeposit(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}
	
	


