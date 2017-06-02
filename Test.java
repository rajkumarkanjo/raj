package com;
//method overloading
public class Test {
	float length;
	float breadth;
	   void Room(float x,float y)   // constructor 1
	{
		length=x;
		breadth=y;
		System.out.println(length*breadth);

	}
	void Room(float x)           //constructor 2
	{
		length=breadth=x;
		System.out.println(length*breadth);
	}
	
	public static void main(String args[])
	{
		Test obj=new Test();
			obj.Room(12,50);
			obj.Room(12);
	}
}
