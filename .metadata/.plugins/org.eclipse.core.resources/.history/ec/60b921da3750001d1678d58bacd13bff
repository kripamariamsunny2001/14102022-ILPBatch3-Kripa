package com.experion.service;

import java.lang.reflect.Array;
import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	
     Product product[] = new Product[3];
	
	public void inputProductDetails(int index) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Proudct Code - ");
		String productCode = scanner.nextLine();
		System.out.println("Enter Product Name - ");
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
		product[index] = new Product(productCode,productName,productDescription,productPrice,openDate,validityDate,expiryDate,active);
	}
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
		System.out.println("Product Name " + "		" + "Product Description" + "		" + "Product Price"
				+ "			" + "Open Date" + "		" + "Expiry Date");
		for(int i=0;i<Array.getLength(product);i++) {
			if(product[i]!=null)
		
		
		System.out.println(product[i].getProductName() + "				" + product[i].getProductDescription() + "				" + product[i].getProductPrice()
				+ "		" + product[i].getOpenDate() + "		" + product[i].getExpiryDate());

	}}}

	
	
	


