package pattern_printing;

import java.util.Scanner;

public class HollowRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows & columns");
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i = 1; i<=n; i++) { // rows
			for(int j = 1; j<=m; j++) { // columns
				if(i == 1 || i == n ||j == 1 || j == m)
					System.out.print("* ");
				else
					System.out.print(" "+" ");
			}
			System.out.println(); // for new line
		}
		sc.close();
	}

}