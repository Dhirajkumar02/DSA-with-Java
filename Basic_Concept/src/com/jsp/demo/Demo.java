package com.jsp.demo;

public class Demo {
	int x; // Instance variable
	
	// Constructor
	Demo(int x){
		this.x=x; // Assigns the parameter value to the instance variable
	}
	
	// Non- static (instance) method
	void showValue() {
		System.out.println(x); // Prints the value of the instance variable
	}

	// Instance initializer block : It is executed before the constructor whenever an object is created
	{
		x = 10; // This block sets the instance variable 'value' to 20

		System.out.println(x); 
	}
	
	public static void main(String[] args) {
		Demo d = new Demo(10); // Creating an object of the class

		System.out.println(d.x); // Prints the instance variable 'value'
		d.showValue();
	}
}
