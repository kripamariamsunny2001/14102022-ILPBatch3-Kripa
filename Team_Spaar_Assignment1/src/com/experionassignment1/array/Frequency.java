package com.experionassignment1.array;

import java.util.Scanner;

public class Frequency {
	int a[]=new int[10];
	int key;
	void getdata()
	{
		Scanner scanner = new Scanner(System.in); 
		int i;
		for(i=0;i<10;i++)
		{
			System.out.println("Enter the Numbers");
			a[i]=scanner.nextInt();
		}
		System.out.println("Enter number to find frequency");
		key=scanner.nextInt();
	}
	void count()
	{
		int i,count=0;
		for(i=0;i<10;i++)
		{
			if(a[i]==key)
				count=count+1;
		}
		System.out.println("Frequency="+count);
		
		}
	}


