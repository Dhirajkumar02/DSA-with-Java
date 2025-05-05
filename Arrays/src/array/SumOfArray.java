package array;

import java.util.Scanner;

public class SumOfArray {

	// Method to calculate sum of array elements
	public static int arraySum(int arr[]) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input size
		System.out.println("Enter Array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		// Input elements
		System.out.println("Enter Array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// Calculate and print sum
		int sum = arraySum(arr);
		System.out.println("Sum of array elements: " + sum);

		sc.close();
	}
}
