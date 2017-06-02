package com;

public class Sub extends Super {

	int y;
	Sub(int x,int y) {
		super(x);
		// TODO Auto-generated constructor stub
		this.y=y;
	}
   
	void display()
	{
		System.out.println("     "+x);
		System.out.println(("    "+y));	
	}
	
	
}
