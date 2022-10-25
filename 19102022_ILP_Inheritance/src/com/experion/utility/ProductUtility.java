package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {
	public static void main(String[] args){
		char mainChoice;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Product> productList=new ArrayList<Product>();

	do {
		System.out.println("1.Add Card Product 2.Add Account Product 3.Display Product");
		int choice=scanner.nextInt();
		switch(choice) {
		case 1 : productList.add(Service.createProduct("Cards"));
			break;
		case 2 : productList.add(Service.createProduct("Accounts"));
			break;
		case 3 : Service.displayProduct(productList);
		}
		System.out.println("Dou you want to continue(y/n)");
		mainChoice=scanner.next().charAt(0);
	}
	while(mainChoice=='y');
      }
}
