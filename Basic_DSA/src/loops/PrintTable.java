package loops;

import java.util.Scanner;

public class PrintTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		System.out.println("Enter the range");
		int range = sc.nextInt();
		sc.close();
		for (int i = 1; i <= range; i++) {
			System.out.println(n +" x "+ i+ " = "+(n*i));
		}
	}
}