package loops;

import java.util.Scanner;

public class Print_All_DivisibleBy_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i<=n; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}	
		}
	}

}