package com.jsp.demo;

public class Employee {
	int id;
	String name;
	Employee e;
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	Employee(Employee e){
		this.e = e;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(10, "Tom");
		Employee e2 = new Employee(e1);
		
		System.out.println(e1.id); // 10
		System.out.println(e2.id); // 0
		
		System.out.println(e1.name); // Tom
		System.out.println(e2.name); // null
		
		System.out.println(e1.e); // null
		System.out.println(e2.e); // Address
		
		System.out.println(e2.e.id); // 10
		System.out.println(e1.name.length()); // 3
		System.out.println(e2.name.length()); // NullPointer Exception because "e2.name" is null
	}
}
