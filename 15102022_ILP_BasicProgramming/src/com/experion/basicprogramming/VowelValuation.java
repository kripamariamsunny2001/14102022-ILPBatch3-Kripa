package com.experion.basicprogramming;

import java.util.Scanner;

public class VowelValuation {

	public static void main(String[] args) {
		char character;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character - ");
		character = scanner.next().charAt(0);
		
		switch(character)
		{
			case 'a': System.out.println(character + " is vowel ");
			      break;
			case 'e': System.out.println(character + " is vowel ");
		          break;
			case 'i': System.out.println(character + " is vowel ");
		      break;
			case 'o': System.out.println(character + " is vowel ");
		      break;
			case 'u': System.out.println(character + " is vowel ");
		      break;
			default : System.out.println(character + " is constant ");
			}
		
	}

}
