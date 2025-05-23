package pattern_printing;

import java.util.Scanner;

public class StarCross {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) { // rows
			for(int j = 1; j<=n; j++) { // columns
				if(i == j || i == (n-j+1))
					System.out.print("* ");
				else
					System.out.print(" "+" ");
			}
			System.out.println(); // for new line
		}
		sc.close();
	}

}
