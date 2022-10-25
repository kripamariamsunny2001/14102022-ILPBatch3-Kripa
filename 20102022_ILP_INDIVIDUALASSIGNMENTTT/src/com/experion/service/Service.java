package com.experion.service;


import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Customer;
import com.experion.entity.SavingMaxAccount;

public class Service {
	
	Scanner scanner = new Scanner(System.in);
	Service service = new Service();
	ArrayList<Service> ServiceList = new ArrayList<Service>();
	public ArrayList<Customer> createAccount(ArrayList<Customer> customer)
	{
		System.out.println("Enter Customer Id");
		String customerId = scanner.nextLine();
		String findCustomerId = checkCustomer(customerId,customer);
		{
			System.out.println("Enter Customer Id`");
			String customerId = scanner.nextLine();
			String findCustomer = checkCustomer(customerId,customer);
			if(CustomerId == null) {
				System.out.println("Customer Id not available!! Create new Account");
				customer=createCustomerAccount("customer");
			}
			else {
				System.out.println("Customer available!! Creating Account using existing details");
				customer=createExistingCustomerAccount(findCustomerId,customer);
			}
		
		return customer;
	}
	
     
	
	private ArrayList<Customer> createCustomerAccount(String string) {
		// TODO Auto-generated method stub
		return null;
	}



	private ArrayList<Customer> createExistingCustomerAccount(String findCustomerId, ArrayList<Customer> customer) {
		// TODO Auto-generated method stub
		return null;
	}



	private String checkCustomer(String customerId, ArrayList<Customer> customer) {
		String findCustomerId = null;
		for (Customer customer : customer) {
			if(customer.getCustomerId().equalsIgnoreCase(customerId)) {
				findCustomerId = customer.getCustomerId();
			}
		}
		return findCustomerId;
	}
	public ArrayList<Customer> createNewAccount(ArrayList<Customer> customer){
		Account account = null;
		
		System.out.println("**********Accounts Available**********");
		System.out.println("1.Savings Max Account  2.Current Account  3.Loan Account");
		System.out.println("Enter your choice:-");
		int choice=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the Customer code:-");
		String customerName = scanner.nextLine();
		System.out.println("Enter the Account code:-");
		String accountCode = scanner.nextLine();
		int accountChoice;
		switch (accountChoice) {
		case 1:
			String accountType = "CurrentAccount";
			ServiceList = Service.addService(accountType);
			account = new SavingMaxAccount(accountCode,accountType,0,bankServiceList);
			System.out.println("Savings Max Account is created for" + customerName + "...Account is Active!!!");
			break;
		case 1:
			String accountType = "SavingMaxAccount";
			ServiceList = Service.addService(accountType2);
			account = new SavingMaxAccount(accountCode,accountType,0,bankServiceList);
			System.out.println("Current Account is created for" + customerName + "...Account is Active!!!");
			break;
			
		default:
			System.out.println("Invalid Choice");
		
		
			
		}
		
		
		int accountChoice - scanner.nextInt();
	}



	public Customer inputAccountDetails(int index) {
		char ch;
		Account account = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the customer Id - ");
		String customerId = scanner.nextLine();
		
				
		System.out.println("Enter the Customer Name - ");
		String productName = scanner.nextLine();
		do
		{
			
			System.out.println("**********Accounts Available**********");
			System.out.println("1.Savings Max Account  2.Current Account  3.Loan Account");
			System.out.println("Enter your choice:-");
			int choice=scanner.nextInt();
			if(choice==1)
			{
				 account=new SavingMaxAccount("SMA001",10000,"Savings Max Account");
			}
			
		
		System.out.println("Do you want to continue(Y/N)");
		ch=scanner.next().charAt(0);
		}
		while(ch=='Y');
		
		Customer customer = new Customer(customerId,productName,account);
		return customer;
	}
		
		
	
	

	public void displayProductDetails(Customer customer) 
	{
		System.out.println(customer.getCustomerCode()+"  "+customer.getCustomerName()+"  "+customer.getAccount().getAccountBalance()+"  "+customer.getAccount().getAccountNumber()+"  "+customer.getAccount().getAccountType());
	}
	public void exit() {
		// TODO Auto-generated method stub
		
	}


	public void inputManageAccount() {
		// TODO Auto-generated method stub
		
	}}
	
	

	
	
	


