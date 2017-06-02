package com;

public class child implements dad,mom {

	@Override
	public void age() {
		// TODO Auto-generated method stub
	System.out.println("Child's age is:::"+((mom.age+dad.age)/2) );	
	}
	@Override
	public void height() {
		// TODO Auto-generated method stub
	System.out.println("Child's age is:::"+((mom.height+dad.height)/2));	
	}
}
