package loops;

import java.util.Scanner;

public class Print_TableOf_N {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		System.out.println("Enter the range");
		int r = sc.nextInt();
		for (int i = n; i <= r; i++) {
			if (i%n == 0) {
				System.out.println(i);
			}
			
		}
		System.out.println("-------");
		for (int i = n; i <= r; i+=n) {
			System.out.println(i);	
		}
		
		sc.close();
	}
}
