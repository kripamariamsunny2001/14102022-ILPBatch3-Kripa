package com.ilpexperion.objectclassbasics;

public class Employee {
	String employeeName="Kripa Mariam Sunny";
	int employeeAge =21;
	char employeeGender = 'F';
	double employeeCgpa = 7.69;
	public void displayEmployeeDetails()
	{
		System.out.println("..................Welcome to ILP program........................");
	    System.out.println("Name" + "                   " + "Age" + "   " +    "Gender" + "   " + "CGPA");
		System.out.println(employeeName + "     " + employeeAge + "      " + employeeGender + "      " + employeeCgpa);
	}

}
