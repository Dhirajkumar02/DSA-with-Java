package pattern_printing;

import java.util.Scanner;

public class AlphanumericReverseTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) { // rows
			for(int j = 1; j<=n+1-i; j++) { // columns
				if(i%2 == 1)
					System.out.print((char)(i+64)+" ");
				else
					System.out.print(i+" ");
			}
			System.out.println(); // for new line
		}
		sc.close();
	}

}
