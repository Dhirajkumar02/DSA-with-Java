package com.jsp.demo;

public class Test {

	protected Test() {
		Test t = new Test(); // Exception StackOverFlow Error
	}
	
	public static void main(String[] args) {
		Test t = new Test(); // Triggers the constructor and starts the infinite recursion
	}
}
