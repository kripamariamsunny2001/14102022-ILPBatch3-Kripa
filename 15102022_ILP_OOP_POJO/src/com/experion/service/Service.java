package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;


public class Service {
	Product product= new Product();
	
	public void inputProductdetails()
	{
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Code - ");
		String productCode = scanner.nextLine();
		
		System.out.println("Enter Product Name - ");
		String productName = scanner.nextLine();
		
		System.out.println("Enter Product Description - ");
		String productdescription = scanner.nextLine();
		
		System.out.println("Enter Product price - ");
		double productprice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Product open Date - ");
		String opendate = scanner.nextLine();
		System.out.println("Enter Validity Date - ");
		String validitydate = scanner.nextLine();
		System.out.println("Enter expiry Date - ");
		String expirydate = scanner.nextLine();
		System.out.println("Active(true/false)- ");
		boolean active = scanner.nextBoolean();
		
		product.setProductCode(productCode);
		product.setProductName(productName);
		product.setProductDescription(productdescription);
		product.setProductPrice(productprice);
		product.setOpenDate(opendate);
		product.setValidityDate(validitydate);
		product.setExpiryDate(expirydate);
		product.setActive(active);
	}
	public void displayProductdetails()
	{
		System.out.println("Product Code"+" "+"Product Name"+"   "+"Product description"+"    "+"Product Price"+"    "+"Open Date"+"     "+"Expiry date");
		System.out.println(product.getProductCode()+"  "+product.getProductName() +"   "+product.getProductDescription()+"    "+product.getProductPrice()+"    "+product.getOpenDate()+"     "+product.getExpiryDate());
		
	}
}
