package pattern_printing;

import java.util.Scanner;

public class StarRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows & columns");
		int m = sc.nextInt();
		int n = sc.nextInt();
		for (int i = 1; i <= m; i++) { // for rows
			for (int j = 1; j <= n; j++) { // for columns
				System.out.print("* ");
			}
			System.out.println(); // for new line
		}
		sc.close();
	}

}