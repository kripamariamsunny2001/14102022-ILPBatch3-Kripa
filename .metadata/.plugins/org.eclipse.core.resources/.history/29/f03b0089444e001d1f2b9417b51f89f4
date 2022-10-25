package com.experionassignment1.array;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[] a=new int[5];
		int i,j,temp;
		System.out.println("Enter 5 elements");
		for(i=0;i<5;i++) {
			a[i]=scanner.nextInt();
		}
			for(i=0;i<5;i++) {
				for(j=i+1;j<5;j++) {
					if (a[i]>a[j]) {
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						
					}
				}
			}
			System.out.println("Sotrted Array in ascending order:");
			for(j=0;j<5;j++) {
				System.out.println(a[j]);
				
			}			
				
		for(i=0;i<5;i++) {
			for(j=i+1;j<5;j++) {
				if (a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println("Sotrted Array in descending order:");
		for(j=0;j<5;j++) {
			System.out.println(a[j]);
			
		}
	}

}
