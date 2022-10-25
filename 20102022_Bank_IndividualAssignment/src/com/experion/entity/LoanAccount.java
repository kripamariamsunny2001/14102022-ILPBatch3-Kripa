package com.experion.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class LoanAccount extends Account {

	public LoanAccount(String accountCode, String accountType, double accountBalance) {
	super(accountCode, accountType, accountBalance);
		
	}
	Scanner scanner = new Scanner(System.in);
	public Account cashDeposit(Account account) {
	System.out.println("Enter the amount to be deposited");
	double cashDeposit=scanner.nextDouble();
	return account;
		
	}

}
