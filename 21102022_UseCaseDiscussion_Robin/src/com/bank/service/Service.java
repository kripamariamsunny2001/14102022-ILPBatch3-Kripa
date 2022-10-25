package com.bank.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.Account;
import com.bank.entity.Customer;
import com.bank.utility.BankUtility;

public class Service {
	
	//String customerId;
	//String customerName;
	
	public static Account createAccount(int accountType) {
		
		Account account = null;
		if(accountType ==1)
		{
			account = new Account("Savings Max Account",1000);
		}
		else if(accountType ==2)
		{
			account = new Account("Current Account",1000);
		}
		else if(accountType ==3)
		{
			account = new Account("Loan Account",0);
		}
		
		return account;
		
		
	}
	public static Customer createCustomer(ArrayList<Account> accountList) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Customer ID: ");
		String customerId = scanner.nextLine();
		System.out.println("Enter Customer Name: ");
		String customerName = scanner.nextLine();
		Customer customer = new Customer(customerId,customerName,accountList);
//		System.out.println(accountList+" created for "+customerName);
//		System.out.println("Account is active!!");
		return customer;
	}
	public static void depositMoney(String accountChoice,Customer customer) {
		
		ArrayList<Account>customerAccountList = new ArrayList<Account>();
		Scanner scanner = new Scanner(System.in);
		customerAccountList = customer.getAccountList();
		//System.out.println("Account Name " + "     "+"Account Balance");
		//for(Account account : customerAccountList)
			//System.out.println(account.getProductName() + "     "+ account.getAccountBalance());
			
		//System.out.println("Select the account you want to deposit money : ");
		//String account = scanner.nextLine();
		//String account = BankUtility;
		System.out.println("Enter the amount to be deposited : ");
		double depositMoney = scanner.nextDouble();
		for(Account selectedAccount : customerAccountList)
			if(selectedAccount.getProductName().compareTo(accountChoice)==0)
			{
				
				selectedAccount.setAccountBalance(selectedAccount.getAccountBalance() + depositMoney);
			}
		
		
	}
	
	public static void withdrawMoney(String accountChoice,Customer customer) 
	{
		
		ArrayList<Account>customerAccountList = new ArrayList<Account>();
		Scanner scanner = new Scanner(System.in);
		customerAccountList = customer.getAccountList();
//		System.out.println("Account Name" + "     "+"Account Balance");
//		for(Account account : customerAccountList)
//			System.out.println(account.getProductName() + "     "+ account.getAccountBalance());
//			
		//System.out.println("Select the account you want to withdraw money from : ");
		//String account = scanner.nextLine();
		//String account = BankUtility.main(accountChoice);
		System.out.println("Enter the amount to be withdrawn : ");
		double withdrawMoney = scanner.nextDouble();
		for(Account selectedAccount : customerAccountList)
			if(selectedAccount.getProductName().compareTo(accountChoice)==0)
			{
				
				selectedAccount.setAccountBalance(selectedAccount.getAccountBalance() - withdrawMoney);
			}
		
	}
	
	public static void displayAccountDetails(Customer customer,ArrayList<Account> accountList) {
		
		System.out.println("******************************Customer-Account Details******************************");
//		System.out.println(" ");
		System.out.println("Customer ID"+"     "+"Customer Name"+"     "+"Account Type"+ "            "+"Account Balance");
		System.out.println("*************************************************************************************************");
//		System.out.println(" ");
		for(Account account : accountList)
			System.out.println(customer.getCustomerId()+"               "+customer.getCustomerName()+ "       "+account.getProductName()+ "        "+account.getAccountBalance());
			
		
	}
	
public static void displayAccounts(ArrayList<Account> accountList) {
		
		for(Account account : accountList)
			System.out.println(account.getProductName());
			
		
	}
	


}
