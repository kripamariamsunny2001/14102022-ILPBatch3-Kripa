package com.experion.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class SavingsMaxAccount extends Account {


	public SavingsMaxAccount(String accountCode, String accountType, double accountBalance)
	{
		super(accountCode, accountType, accountBalance);
		
	}
	
	Scanner scanner = new Scanner(System.in);
	@Override
	public Account cashDeposit(Account account) {
		System.out.println("Enter the amount to be deposited");
		double cashDeposit=scanner.nextDouble();
		account.setAccountBalance(account.getAccountBalance()+cashDeposit);
		return account;

	}

	public Account Withdrawal(Account account) {
		System.out.println("Enter the amount to be withdrawed");
		double cashWithdrawal=scanner.nextDouble();
		if(account.getAccountBalance()>0)
			account.setAccountBalance(account.getAccountBalance()-cashWithdrawal);
		else
			System.out.println("No Account Balance");
		return account;
	}

	
		
	}

	
	


