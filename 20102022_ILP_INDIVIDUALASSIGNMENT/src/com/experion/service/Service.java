package com.experion.service;

import java.lang.reflect.Array;
import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	
     Product product[] = new Product[3];
	
	public void inputProductDetails(int index) {
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the customer Id - ");
		String customerId = scanner.nextLine();
		if(customerId!=null)
		 	{
				System.out.println("Customer Id not available. Create a new Account");
				System.out.println("**********Accounts Available**********");
				System.out.println("1. Savings Max Account  2.Current Account  3.Loan Account");
				choice=scanner.nextInt();
		 	}
			if(choice==1)
			{
				System.out.println("Enter the customer Id:-");
				String customerId1 = scanner.nextLine();
				System.out.println("Enter the customer Name:-");
				String productName1 = scanner.nextLine();
				System.out.println("Savings Max Account created for  "+productName1);
				System.out.println("Account is Active!!!!!!!");
				
			}
			else if(choice==2)
			{
				System.out.println("Enter the customer Id:-");
				String customerId1 = scanner.nextLine();
				System.out.println("Enter the customer Name:-");
				String productName1 = scanner.nextLine();
				System.out.println("Current Account created for  "+productName1);
				System.out.println("Account is Active!!!!!!!");
				
				
			}
			else
				
				{
					System.out.println("Enter the customer Id:-");
					String customerId1 = scanner.nextLine();
					System.out.println("Enter the customer Name:-");
					String productName1 = scanner.nextLine();
					System.out.println("Loan Account created for  "+productName1);
					System.out.println("Account is Active!!!!!!!");
					
					
				}}
			public void inputManageAccount(int index) {
				Scanner scanner = new Scanner(System.in);
				String productName1 ;
				System.out.println("Enter the customer Id - ");
				String customerId = scanner.nextLine();
				System.out.println("Enter the customer Name:-");
				String productName2 = scanner.nextLine();
				
				System.out.println(productName2 +  "has the following accounts");
				System.out.println("1. Savings Max Account  2.Current Account  3.Loan Account");
				int choice = scanner.nextInt();
		 	
			if(choice==1)
			{
				System.out.println("Savings Max Account");
				System.out.println("1. Deposit  2.Withdraw  3.Display Account");
				int choice1 = scanner.nextInt();
				
					if(choice==1)
					{
						System.out.println("Enter the amount to be deposited:-");
						double amountDeposited = scanner.nextDouble();
						
					}
				
				
				
			}
			else if(choice==2)
			{
				System.out.println("Current Account");

			}
			else
			{ System.out.println("Loan Account");
			
			}}
				
		/*System.out.println("Enter the Customer Name - ");
		String productName = scanner.nextLine();
		System.out.println("Enter Product Description - ");
		String productDescription = scanner.nextLine();
		System.out.println("Enter Product Price - ");
		double productPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Product Open Date - ");
		String openDate = scanner.nextLine();
		System.out.println("Enter Product Valdity Date - ");
		String validityDate = scanner.nextLine();
		System.out.println("Enter Product Expiry Date - ");
		String expiryDate = scanner.nextLine();
		System.out.println("Active (true or false) - ");
		boolean active = scanner.nextBoolean();
		product[index] = new Product(customerId,productName,productDescription,productPrice,openDate,validityDate,expiryDate,active);
	}*/
		/*product.setProductCode(productCode);
		product.setProductName(productName);
		product.setProductDescription(productDescription);
		product.setProductPrice(productPrice);
		product.setOpenDate(openDate);
		product.setExpiryDate(expiryDate);
		product.setValidityDate(validityDate);
		product.setActive(active);*/
	

	public void displayProductDetails() 
	{
		System.out.println("Customer Id"+"  "+"Customer Name " + "		" + "Account Type" + "		" + "Balance");
				
		for(int i=0;i<Array.getLength(product);i++) {
			if(product[i]!=null)
		
		
		System.out.println(product[i].getCustomerId()+"  "+product[i].getProductName() );
	}}}

	
	
	


