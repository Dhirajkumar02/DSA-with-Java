package pattern_printing;

import java.util.Scanner;

public class FlodysRightAngleTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int a = 1;
		for(int i = 1; i<=n; i++) { // rows
			for(int j = 1; j<=i; j++) { // columns
				System.out.print(a++ +" ");
			}
			System.out.println(); // for new line
		}
		sc.close();
	}

}
