package com.bank.service;

import java.util.Scanner;

public class MisService {
	
	public static String enterAccountChoice() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which account you want to open 1. SMA 2.CA 3. LA");
		String customerAccountChoice = scanner.nextLine();
		return customerAccountChoice;
		
	}

}
