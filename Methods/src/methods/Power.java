package methods;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int pow = 1;
		if (x == 0 && y == 0) {
			System.out.println("Not a number");
			sc.close();
			return;
		}
		for (int i = 1; i <= y; i++) {
			pow *= x;
		}
		System.out.println(pow);
		sc.close();
	}

}
