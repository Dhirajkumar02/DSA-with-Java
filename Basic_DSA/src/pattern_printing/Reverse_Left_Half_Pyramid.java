package pattern_printing;

import java.util.Scanner;

public class Reverse_Left_Half_Pyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int sp = 0 , st=n;
		for(int i = 1; i<=n; i++) { // rows
			for(int j = 1; j<=sp; j++) { // columns
				System.out.print("  ");
			}
			for(int j=1; j<=st; j++) {
				System.out.print("*"+" ");
			}
			sp++;
			st--;
			System.out.println(); // for new line
		}
		sc.close();
	}

}
