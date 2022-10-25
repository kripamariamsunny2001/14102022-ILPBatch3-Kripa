package com.experion.utility;

import java.util.Scanner;

import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		
		Service service = new Service();
		Scanner scanner = new Scanner(System.in);
		int choice;
		char ch;
		int index=0;
		do {
		System.out.println("*********Welcome To Supermarket********");
		System.out.println("Services Available : 1. Add Stock  2. Diaplay Stock(Select service option)");
		choice=scanner.nextInt();
		
		if(choice==1)
		{
			
				service.inputProductDetails(index);
				index++;}
		else if (choice==2) {
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
