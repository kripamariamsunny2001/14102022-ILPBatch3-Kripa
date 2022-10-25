package com.experion.entity;

import java.util.Scanner;

public class Product {
	String productCode;
	String productName;
	String productdescription;
	double productprice;
	String opendate;
	String validitydate;
	String expirydate;
	boolean active;
	
	public void inputProductdetails()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Code - ");
		productCode = scanner.nextLine();
		System.out.println("Enter Product Name - ");
		productName = scanner.nextLine();
		System.out.println("Enter Product Description - ");
		productdescription = scanner.nextLine();
		System.out.println("Enter Product price - ");
		productprice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Product open Date - ");
		opendate = scanner.nextLine();
		System.out.println("Enter Validity Date - ");
		validitydate = scanner.nextLine();
		System.out.println("Enter expiry Date - ");
		expirydate = scanner.nextLine();
		System.out.println("Active(true/false)- ");
		active = scanner.nextBoolean();
	}
	public void displayProductdetails() {
		System.out.println("Product Name"+"   "+"Product description"+"    "+"Product Price"+"    "+"Open Date"+"     "+"Expiry date");
		System.out.println(productName +"   "+productdescription+"    "+productprice+"    "+opendate+"     "+expirydate);
		
	}
}
