package com.bank.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.Account;
import com.bank.entity.Customer;
import com.bank.service.MisService;
import com.bank.service.Service;

public class BankUtility {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Account> accountList = new ArrayList<Account>();
		Customer customer = null;
		char choice;
		do
		{
			System.out.println("1.Create Account 2.Deposit Money 3. Display Account Details");
			int mainChoice = scanner.nextInt();
			switch(mainChoice)
			{
				case 1: String customerAccountChoice = MisService.enterAccountChoice();
						accountList.add(Service.createAccount(customerAccountChoice));
						customer = Service.createCustomer(accountList);
						break;
				case 2: Service.depositMoney(customer);
						break;
				case 3: Service.displayAccountDetails(accountList);
			}
			System.out.println("Do you want to continue : - ");
			choice = scanner.next().charAt(0);
			
		}
		while(choice == 'y');
		

	}

	
	

	

}
