package pattern_printing;

import java.util.Scanner;

public class OddNumberTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) { // rows
			for(int j = 1; j<=i; j++) { // columns
				System.out.print((2*j-1)+" ");
			}
			System.out.println(); // for new line
		}
		sc.close();
	}

}