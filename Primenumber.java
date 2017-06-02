package com;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
      Scanner sc =new Scanner(System.in);
      System.out.println("enter a number to check prime----");
      int n=sc.nextInt();
      for(int i=1;i<n;i++)
      {
    	  if(n%i==0)
    	  {
    		count++;
    	  }
     }
      if(count==1)
      {
    	  System.out.println("no is prime");
      }else{
    	  System.out.println("no is not prime");
      
      }}
    		  
      
      
      
	}

