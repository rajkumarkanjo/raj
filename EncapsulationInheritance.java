package com;

public class EncapsulationInheritance {
	int a;
	int b;
	public EncapsulationInheritance(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	protected void run()
	{
		System.out.println("This is in parent class and the sum of a and b is:::" +(a+b));
	}

}


