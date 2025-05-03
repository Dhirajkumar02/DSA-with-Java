package methods;

import java.util.Scanner;

public class Swap_Two_Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int b = sc.nextInt();
//		System.out.println(a + " " + b);
//		
//		// Using 3rd variable
//		
//		 int temp = a; 
//		 a = b; 
//		 b = temp; 
//		 System.out.println(a+" "+b);
//		 
//		System.out.println("----------------");
//		
//		// Without using 3rd variable
//		
//		System.out.println(a + " " + b);
//		a = a + b;
//		b = a - b;
//		a = a - b;
//		System.out.println(a + " " + b);

		// using XOR

		System.out.println(a + " " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a + " " + b);

		sc.close();
	}

}
