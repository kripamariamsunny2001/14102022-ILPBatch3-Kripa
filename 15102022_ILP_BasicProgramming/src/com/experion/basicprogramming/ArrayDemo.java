package com.experion.basicprogramming;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		 String productName[] = new String[5];
		 System.out.println("Enter products - ");
		 
		 productName[0]=scanner.nextLine();
		 productName[1]=scanner.nextLine();
		 productName[2]=scanner.nextLine();
		 productName[3]=scanner.nextLine();
		 productName[4]=scanner.nextLine();
		 
		 System.out.println("The product names are ");
		 System.out.println(productName[0] );
		 System.out.println(productName[1] );
		 System.out.println(productName[2] );
		 System.out.println(productName[3] );
		 System.out.println(productName[4] );

	}

}
