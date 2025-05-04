package array;

import java.util.Scanner;

public class TakingInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		//Input
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// Output
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]*2);
		}
		
		sc.close();
	}

}
