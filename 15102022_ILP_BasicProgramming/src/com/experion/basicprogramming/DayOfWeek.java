package com.experion.basicprogramming;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number - ");
		number = scanner.nextInt();
		
		
		switch(number)
		{
			case 1: System.out.println(number + " is Monday ");
			      break;
			case 2: System.out.println(number + " is Tuesday ");
		          break;
			case 3: System.out.println(number + " is Wednesday ");
		      break;
			case 4: System.out.println(number + " is Thursday ");
		      break;
			case 5: System.out.println(number + " is Friday ");
		      break;
			case 6: System.out.println(number + " is Saturday ");
		      break;
			case 7: System.out.println(number + " is Sunday ");
		      break;
			default : System.out.println(number + " is Invalid ");
	}
}
}
