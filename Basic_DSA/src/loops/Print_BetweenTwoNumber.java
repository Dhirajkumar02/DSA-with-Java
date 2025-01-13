package loops;

import java.util.Scanner;

public class Print_BetweenTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();
		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
