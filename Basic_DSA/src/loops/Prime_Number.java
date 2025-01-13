package loops;

import java.util.Scanner;

public class Prime_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean flag = false;
		for(int i=2; i<Math.sqrt(n); i++) {
			if(n%i == 0) { // i is a factor of n
				flag = true; // true means composite
			}
		}
		if(n <= 1) {
			System.out.println("Neither Prime Nor Composite");
		}
		else if (flag == false) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Composite Number");

		}
		
		sc.close();
	}
}
