package com.bank.service;

import java.util.Scanner;

public class MisService {
	
	public static int enterAccountChoice() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("***Accounts Available***");
		System.out.println("1.SavingsMax Account\n2.Current Account\n3.Loan Account");
		int customerAccountChoice = scanner.nextInt();
		return customerAccountChoice;
		
	}

}
