package com;

import java.util.Scanner;

public class Sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0,sum=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a numer to find the digit sum-----::");
       int n=sc.nextInt();
         while(n>0)
         {
        	 int rem=n%10;
        	 sum+=rem;
        	 n=n/10;	    	 
         }
		System.out.println("digit sum is  "+sum);
			
		
	}

}
