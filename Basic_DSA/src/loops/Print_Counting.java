package loops;

import java.util.Scanner;

public class Print_Counting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		sc.close();
	}
}
