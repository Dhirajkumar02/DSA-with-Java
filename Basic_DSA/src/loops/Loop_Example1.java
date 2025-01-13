package loops;

import java.util.Scanner;

public class Loop_Example1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		sc.close();
		int i;
		for (i = 1; i <= n; i++) {
			System.out.println("Hello");
		}
		System.out.println(i);
	}
}
