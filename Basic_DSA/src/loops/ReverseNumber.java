package loops;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int rev = 0;
		//n = Math.abs(n);
		while(n != 0) {
			int lastDigit = n%10;
			rev = rev*10+lastDigit;
			n /= 10;
		}
		System.out.println(rev);
		sc.close();
	}

}
