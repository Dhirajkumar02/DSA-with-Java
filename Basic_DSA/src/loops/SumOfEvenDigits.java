package loops;

import java.util.Scanner;

public class SumOfEvenDigits {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum = 0;
		// Convert to absolute value to handle negative numbers means to convert negative number to positive number
		num = Math.abs(num);
		while (num != 0){
			int digit = num%10; // To get last digit
			
			// Sum of even digit
			if(digit % 2 == 0) {
				sum += digit; // Add to Sum
			}
			num /= 10; //Remove the last digit
		}
		System.out.println(sum);

		sc.close();
	}

}
