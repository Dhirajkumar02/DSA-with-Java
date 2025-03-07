package pattern_printing;

import java.util.Scanner;

public class NumberTriangleReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) { // rows
			for(int j = 1; j<=n-i; j++) { // columns
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				//System.out.print(j+" ");
				//System.out.print(i+" ");
				System.out.print((char)(j+64)+" ");
			}
			System.out.println(); // for new line
		}
		sc.close();
	}

}
