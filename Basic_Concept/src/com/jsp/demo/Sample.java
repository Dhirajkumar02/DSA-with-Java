package com.jsp.demo;

public class Sample {
	
	// 1 output
	static {
		System.out.println("Hi");
	}
	
	// 3 output
	{
		System.out.println("Hi");
	}
	
	// 4 output
	public Sample() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// 2 output
		System.out.println("By");
		Sample s = new Sample();
		
	}
}
