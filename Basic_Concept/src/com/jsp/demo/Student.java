package com.jsp.demo;

public class Student {
	int x =10;
	//	x=20; // Error - we can't re-initialize to global scope
	
	{
		x=40;
	}
	static int a = 10;
	
	// final variable cannot be re-initialize
	final int b = 30;
	public static void main(String[] args) {
		// static variable can be re-initialize
		a = 20;
		
		Student s = new Student();
		System.out.println(a);
		
		System.out.println(s.x);
		
	}

}
