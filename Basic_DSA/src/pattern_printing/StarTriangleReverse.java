package pattern_printing;

import java.util.Scanner;

public class StarTriangleReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
//		for(int i = 1; i <= n; i++) { // rows
//			for(int j = 1; j <= n; j++) { // columns
//				if((i+j) > n)
//					System.out.print("* ");
//				else
//					System.out.print(" "+" ");
//			}
//			System.out.println(); // for new line
//		}
		
		// Method -2
		for(int i = 1; i<=n; i++) { // rows
			for(int j = 1; j<=n-i; j++) { // columns
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
				
			}
			System.out.println(); // for new line
		}
		sc.close();
	}

}
