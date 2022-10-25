package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class EmployeeDetailsscanner {

	public static void main(String[] args) {
		
	Scanner scanner= new Scanner(System.in);
	
	String trainingName = "..................Welcome to ILP program........................";
	String employeeName;
	int employeeAge;
	char employeeGender;
	double employeeCgpa;
	System.out.println("Enter your employee name - ");
	employeeName=scanner.nextLine();
	System.out.println("Enter your age- ");
	employeeAge=scanner.nextInt();
	System.out.println("Enter your Gender- "); 
	employeeGender=scanner.next().charAt(0);
	System.out.println("Enter your CGPA- "); 
	employeeCgpa=scanner.nextDouble();
    
    
	}

}
