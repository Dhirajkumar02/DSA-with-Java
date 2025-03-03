package pattern_printing;

import java.util.Scanner;

public class Rhombus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		/*for(int i = 1; i<=n; i++) { // rows
			for(int j = 1; j<=n-i; j++) { // columns
				System.out.print("  ");
			}
			for(int j=1; j<=n; j++) {
				System.out.print("*"+" ");
			}
			System.out.println(); // for new line
		}*/
		
		int sp = n-1 , st=n;
		for(int i = 1; i<=n; i++) { // rows
			for(int j = 1; j<=sp; j++) { // columns
				System.out.print("  ");
			}
			for(int j=1; j<=st; j++) {
				System.out.print("*"+" ");
			}
			sp--;
			
			System.out.println(); // for new line
		}
		sc.close();
	}

}
