package com.bank.entity;


import java.util.ArrayList;
import java.util.Scanner;

import com.bank.service.Service;

public class CurrentAccount extends Account  {

	
	

	public CurrentAccount(String accountCode, String accountType, double accountBalance,
			ArrayList<Service> service) {
		super(accountCode, accountType, accountBalance, service);
		// TODO Auto-generated constructor stub
	}
	Scanner scanner = new Scanner(System.in);



	
	public Account cashDeposit(Account account) {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to be deposited");
		double cashDeposit=scanner.nextDouble();
		account.setAccountBalance(account.getAccountBalance()+cashDeposit);
		return account;
	}


	public Account Withdrawal(Account account) {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to be withdrawed");
		double cashWithdrawal=scanner.nextDouble();
		if(account.getAccountBalance()>0)
			account.setAccountBalance(account.getAccountBalance()-cashWithdrawal);
		else
			System.out.println("No Account Balance");
		return account;
	}

}
