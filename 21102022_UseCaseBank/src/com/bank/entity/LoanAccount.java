package com.bank.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class LoanAccount extends Account {

	
	

	public LoanAccount(String accountCode, String accountType, double accountBalance,
			ArrayList<Service> service) {
		super(accountCode, accountType, accountBalance, service);
		// TODO Auto-generated constructor stub
	}
	Scanner scanner = new Scanner(System.in);


	
	

	@Override
	public Account cashDeposit(Account account) {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to be deposited");
		double cashDeposit=scanner.nextDouble();
		return account;
		
	}

}
