package com.experion.utility;

import java.util.Scanner;

import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		
		Service service = new Service();
		Scanner scanner = new Scanner(System.in);
		String customerId = null; 
		int choice;
		char ch;
		int index=0;
		do {
		System.out.println("*************Welcome To Bank************");
		System.out.println("1.Create Accounts  2.Manage Accounts  3.Display Accounts  4.Exit");
		System.out.println("Enter your choice:-");
		choice=scanner.nextInt();
		
		if(choice==1)
		{
				service.inputProductDetails(index);
					
				
				index++;
		}
		else if (choice==2) {
			service.inputManageAccount(index);
			index++;
		}
		
		else if (choice==3) {
			service.displayProductDetails();}
			else {
				System.out.println("Invalid Option");
			}
			System.out.println("Do you want to continue(Y/N)");
			ch=scanner.next().charAt(0);
			}
			while(ch=='Y');
			
		
		
		

	}

}
