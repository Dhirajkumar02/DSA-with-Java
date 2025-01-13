package loops;

import java.util.Scanner;

public class Print_All_Even_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		//This loop will execute n number of times
		for (int i = 1; i<=n; i+=1) {
			if (i % 2 == 0) {
				System.out.println(i);
			}	
		}
		
		System.out.println("--------------");
		
		//This loop will execute n/2 times means half of n numbers
		for (int i = 2; i<=n; i+=2) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
