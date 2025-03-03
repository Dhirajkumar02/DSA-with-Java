package pattern_printing;

import java.util.Scanner;

public class Alphabet_Pyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) { // rows
			for(int j = 1; j<=n-i; j++) { // columns
				System.out.print("  ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println(); // for new line
		}
		sc.close();
	}

}
