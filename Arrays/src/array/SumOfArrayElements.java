package array;

import java.util.Scanner;

public class SumOfArrayElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		// Input
		System.out.println("Enter Array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);

		sc.close();
	}

}
