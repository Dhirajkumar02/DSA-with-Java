package loops;

import java.util.Scanner;

public class Display_AP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		//Display Arithmetic Progression i.e - 1,3,5,7,9,11,.....upto n terms
		// AP an= a+(n-1)d  an = 1+(n-1)*2 an= 2n-1
		for (int i = 1; i <= (2*n-1); i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		// Second AP 4, 10, 13, 16.....
		//an = a+(n-1)d  an=4+(n-1)3 an=3n+1
		for (int i = 4; i <= (3*n+1); i+=3) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// 2 5 8 11 14
		int a = 2 , d = 3;
		for(int i = 1; i<=n; i++) {
			System.out.print(a+" ");
			a += d;
		}
		sc.close();
	}

}
