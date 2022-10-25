package com.bank.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.Account;
import com.bank.entity.CurrentAccount;
import com.bank.entity.Customer;
import com.bank.entity.SavingsMaxAccount;
import com.experion.entity.BankServices;

public class Service {
	Scanner scanner = new Scanner(System.in);
	BankServices bankService = new BankServices();
	ArrayList<BankServices> bankServicesList = new ArrayList<BankServices>();
	
	public ArrayList<Customer> createAccount(ArrayList<Customer> customers) // to create account
	{
		System.out.println("Enter Customer Id");
		String customerIdEnter = scanner.nextLine();
		String findCustomerId = checkCustomer(customerIdEnter,customers);
		if (findCustomerId == null) {
			System.out.println("Customer Id not available!! Create a new Account");
			customers=createNewCustomerAccount(customers);
		}
		else {
			System.out.println("Customer available!! Creating Account using existing details");
			customers=createExistingCustomerAccount(findCustomerId,customers);
		}
		return customers;
	}

	

	public String checkCustomer(String customerIdEnter, ArrayList<Customer> customers) // To search existing customer
	{
		String findCustomerId = null;
		for (Customer customer : customers) {
			if (customer.getCustomerId().equalsIgnoreCase(customerIdEnter)) {
				findCustomerId = customer.getCustomerId();
			}
		}
		return findCustomerId;
	}

	public ArrayList<Customer> createNewCustomerAccount(ArrayList<Customer> customers) { //for creating account for new customer
		Account account = null;
		
		System.out.println("*******Accounts Available***********");
		System.out.println("1.Savings Max Account\n2.Current Account\n3.Loan Account");
		System.out.println("Enter your choice");
		int accountChoice = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the Customer Code :");
		String customerCode = scanner.nextLine();
		System.out.println("Enter the Customer Name :");
		String customerName = scanner.nextLine();
		System.out.println("Enter the Account Code :");
		String accountCode = scanner.nextLine();
		switch (accountChoice) {
		case 1:
			String accountType = "SavingsMaxAccount";
			bankServicesList =bankService.addBankServices(accountType);
			account = new SavingsMaxAccount( accountCode,accountType, 0,bankServicesList);
			System.out.println("Savings Max Account is created for " + customerName + "...Account is Active !!");
			break;
		case 2:
			String accountType2 = "CurrentAccount";
			bankServicesList =bankService.addBankServices(accountType2);
			account = new SavingsMaxAccount( accountCode,accountType2, 0,bankServicesList);
			System.out.println("Current Account is created for " + customerName + "...Account is Active !!");
			break;
		case 3:
			String accountType3 = "LoanAccount";
			bankServicesList =bankService.addBankServices(accountType3);
			account = new SavingsMaxAccount( accountCode,accountType3, 0,bankServicesList);
			System.out.println("Loan Account is created for " + customerName + "...Account is Active !!");
			break;
		default:
			System.out.println("Invalid Choice");
		}
		System.out.println("Available Services are :");
		for(BankServices bankService : bankServicesList)
		{
			System.out.println(bankService.getServiceName());
		}
		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(account);
		Customer customer = new Customer(customerCode, customerName, accounts);
		customers.add(customer);
		return customers;
	}
	
	public ArrayList<Customer> createExistingCustomerAccount(String findCustomerId,ArrayList<Customer> customers) { // for creating account for existing customer
		// TODO Auto-generated method stub
		Account account = null;
		String customerCode=null;
		String customerName=null;
		System.out.println("Products Available");
		System.out.println("1.Savings Max Account\n2.Current Account\n3.Loan Account");
		System.out.println("Enter your choice");
		int accountChoice = scanner.nextInt();
		System.out.println("Enter the Account Code :");
		String accountCode = scanner.nextLine();
		for (Customer customer : customers) {
			if (customer.getCustomerId() == findCustomerId) {
				customerCode=customer.getCustomerId();
				customerName = customer.getCustomerName();
			}
		}
		switch (accountChoice) {
		case 1:
			String accountType = "SavingsMaxAccount";
			bankServicesList =bankService.addBankServices(accountType);
			account = new SavingsMaxAccount(accountCode,accountType, 0,bankServicesList);
			System.out.println("Savings Max Account is created for " + customerName + "......Account is Active !!");
			break;
		case 2:
			String accountType2 = "CurrentAccount";
			bankServicesList =bankService.addBankServices(accountType2);
			account = new SavingsMaxAccount( accountCode,accountType2, 0,bankServicesList);
			System.out.println("Current Account is created for " + customerName + "....Account is Active !!");
			break;
		case 3:
			String accountType3 = "LoanAccount";
			bankServicesList =bankService.addBankServices(accountType3);
			account = new SavingsMaxAccount( accountCode,accountType3, 0,bankServicesList);
			System.out.println("Loan Account is created for " + customerName + "...Account is Active !!");
			break;
		default:
			System.out.println("Invalid Choice");
		}
		/*System.out.println("Available Services are :");
		for(BankServices bankService : bankServicesList)
		{
			System.out.println(bankService.getServiceName());
		}
		for (Customer customer : customers) {
			if (customer.getCustomerId() == findCustomerId) {
				ArrayList<Account> accounts = customer.getAccount();
				accounts.add(account);
			}
		}
		*/
		return customers;
	}
	
	public void displayAccount(ArrayList<Customer> customers,String customerCode) { //to display account details of a customer
		System.out.println("CustomerCode		CustomerName       AccountCode		 AccountType                Balance");
		for (Customer customer : customers) {
			if (customer.getCustomerId().equalsIgnoreCase(customerCode)) {
				ArrayList<Account> accounts=customer.getAccount();
				for(Account account : accounts) {
					if(account!=null) {
						System.out.println(customer.getCustomerId()+"   "+customer.getCustomerName()+"  "+account.getAccountCode()+"     "+account.getAccountType()+"     "+account.getAccountBalance());
						
					
				}}
			}
		}
		
	}

	public ArrayList<Customer> manageAccount(ArrayList<Customer> customers) { //to manage accounts
		// TODO Auto-generated method stub
		
		System.out.println("Enter Customer Id");
		String customerCodeEnter = scanner.nextLine();
		String customerName=null;
		ArrayList<Account> accounts =null;
		int findCustomer = 0;
		String accountSelection = null;
		BankServices bankService = new BankServices();
		for (Customer customer : customers) {
			if (customer.getCustomerId().equalsIgnoreCase(customerCodeEnter) ){
				findCustomer = 1;
				customerName = customer.getCustomerName();
				accounts=customer.getAccount();
			}

		}
		if(findCustomer==0) {
			System.out.println("Invalid Customer Id");}
		else {
			System.out.println(customerName+" has the following accounts");
			for(Account account : accounts) {
				if(account!=null)
					System.out.println(account.getAccountType());
			}
			
			System.out.println("Enter the account for service : ");
			accountSelection = scanner.nextLine();
			switch(accountSelection)
			{
			case "SavingsMaxAccount" : customers=bankService.maxAccountService(customers,customerCodeEnter);
				break;
			//case "CurrentAccount" : customers=bankService.currentAccountService(customers,customerCodeEnter);
			//	break;
			//case "Loan Account" : customers=bankService.loanAccountService(customers,customerCodeEnter);
			//	break;
			default : System.out.println("Invalid Selection");
			}
		}	
		//displayAccount(customers,customerCodeEnter);}
		return customers;
}}
	
	/*public static Account createAccount(String accountType) {
		
		Account account = null;
		if(accountType.compareTo("SMA")==0)
		{
			account = new Account("Savings Max Account", 1000);
		}
		else if(accountType.compareTo("CA")==0)
		{
			account = new Account("Current Account",1000);
		}
		else if(accountType.compareTo("LA")==0)
		{
			account = new Account("Loan Account",0);
		}
		
		return account;
		
		
	}
	public static Customer createCustomer(ArrayList<Account> accountList) {
		
		Customer customer = new Customer("Robin",accountList);
		return customer;
	}
	public static void depositMoney(Customer customer) {
		
		ArrayList<Account>customerAccountList = new ArrayList<Account>();
		Scanner scanner = new Scanner(System.in);
		customerAccountList = customer.getAccountList();
		System.out.println("Account Name " + "     "+"Account Balance");
		for(Account account : customerAccountList)
			System.out.println(account.getProductName() + "     "+ account.getAccountBalance());
			
		System.out.println("Select the account you want to deposit money - ");
		String account = scanner.nextLine();
		System.out.println("Enter the amount to be deposited - ");
		double depositMoney = scanner.nextDouble();
		for(Account selectedAccount : customerAccountList)
			if(selectedAccount.getProductName().compareTo(account)==0)
			{
				
				selectedAccount.setAccountBalance(selectedAccount.getAccountBalance() + depositMoney);
			}
		
		
	}
	public static void displayAccountDetails(ArrayList<Account> accountList) {
		
		System.out.println("Account Name " + "     "+"Account Balance");
		for(Account account : accountList)
			System.out.println(account.getProductName() + "     "+ account.getAccountBalance());
			
		
	}*/


}
