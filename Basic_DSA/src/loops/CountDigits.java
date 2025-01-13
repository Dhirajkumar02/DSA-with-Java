package loops;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		// Convert negative to positive
		num = Math.abs(num);
		
		int count = (num == 0) ? 1 : 0;
//		if(num == 0) count++;
		while (num != 0){
			num /= 10; // Remove the last digit
			count++; // Increment the count
		}
		System.out.println(count);
		
		sc.close();
	}

}
