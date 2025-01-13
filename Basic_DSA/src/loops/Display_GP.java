package loops;

import java.util.Scanner;

public class Display_GP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		// Geometry Progression gp = a*r to power of n-1
		// a=1 r = 2 n=6
		// gp = 1*2*n-1
		// 1 2 4 8 16 ...... upto n terms
		int a = 1 , r = 2;
		for (int i = 1; i <=n; i++) {
			System.out.print(a+" ");
			a *= r;
		}
		sc.close();
	}

}
