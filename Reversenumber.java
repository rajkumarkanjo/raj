package com;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		while(n>1)
		{
			int rem=n%10;
			reverse= (reverse*10+rem);
			n=n/10;	
		}
				System.out.println("reverse_no_is  "+reverse);
		
		

	}

}
