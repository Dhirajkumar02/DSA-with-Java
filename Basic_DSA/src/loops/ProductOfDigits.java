package loops;

import java.util.Scanner;

public class ProductOfDigits {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int product = 1;
		// Convert to absolute value to handle negative numbers means to convert negative number to positive number
		num = Math.abs(num);
		while (num != 0){
			int digit = num%10; // To get last digit
			
			// print the product of non-zero digits in the given number
			if(digit != 0) {
				product *= digit; // Add to Sum
			}
			num /= 10; //Remove the last digit
		}
		System.out.println(product);

		sc.close();
	}

}
