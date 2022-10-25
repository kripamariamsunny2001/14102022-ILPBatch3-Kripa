package com.bank.entity;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.service.Service;
import com.experion.entity.BankServices;

public class SavingsMaxAccount extends Account {




	public SavingsMaxAccount(String accountCode, String accountType, double accountBalance,
			ArrayList<Service> bankservices) {
		super(accountCode, accountType, accountBalance, bankservices);
		
	}

	
	public Account cashDeposit(Account account) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount to be deposited");
		double cashDeposit=scanner.nextDouble();
		account.setAccountBalance(account.getAccountBalance()+cashDeposit);
		return account;

	}

	public Account Withdrawal(Account account) {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to be withdrawed");
		Scanner scanner = null;
		double cashWithdrawal=scanner.nextDouble();
		if(account.getAccountBalance()>0)
			account.setAccountBalance(account.getAccountBalance()-cashWithdrawal);
		else
			System.out.println("No Account Balance");
		return account;
	}

	
		
	}

	
	


