package com.experionassignment1.array;

import java.util.Scanner;

public class CountOccurrence {

	public static void main(String[] args) {
		int n,x,count=0,i=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of elements");
		n=scanner.nextInt();
		int a[]=new int[n];
		System.out.println("Enter all elements");
		for(i=0;i<n;i++)
		{
			a[i]=scanner.nextInt();
		}
		System.out.println("Enter the element of which you want to count number of occurences:");
		x=scanner.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				count++;
			}
		}
		System.out.println("Number of occurence of the element:"+count);
		
		

	}

}
