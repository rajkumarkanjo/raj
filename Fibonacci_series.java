package com;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value for the series ----::::");
		int n=sc.nextInt();
		System.out.println(0);
		for(int i=0;i<=n;i++)
		{
		   n3=n1+n2;
		   n1=n2;
		   n2=n3;
		   System.out.println(n3);
		}
		
	}

}
