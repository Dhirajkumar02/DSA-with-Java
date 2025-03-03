package pattern_printing;

import java.util.Scanner;

public class Star_Pyramid_M2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int sp = n-1 , st=1;
		for(int i = 1; i<=n; i++) { // rows
			for(int j = 1; j<=sp; j++) { // columns
				System.out.print("  ");
			}
			for(int j=1; j<=st; j++) {
				System.out.print("*"+" ");
			}
			sp--;
			st +=2;
			System.out.println(); // for new line
		}
		sc.close();
	}

}
