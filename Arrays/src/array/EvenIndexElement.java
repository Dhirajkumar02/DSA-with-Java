// WAJP to print the even index elements of the array using a method

package array;

import java.util.Scanner;

public class EvenIndexElement {

	// Method to print elements at even indices

	/*
	 * public static void printEvenIndexElements(int[] arr) {
	 * System.out.println("Elements at even indices:"); for (int i = 0; i <
	 * arr.length; i++) { if (i % 2 == 0) { System.out.println("Index " + i + ": " +
	 * arr[i]); } } }
	 */

	// Optimized method to print elements at even indices
	public static void printEvenIndexElements(int[] arr) {
		System.out.println("Elements at even indices:");
		for (int i = 0; i < arr.length; i += 2) {
			System.out.println("Index " + i + ": " + arr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input array size
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();

		// Create and fill the array
		int[] arr = new int[size];
		System.out.println("Enter " + size + " elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// Call method to print even index elements
		printEvenIndexElements(arr);

		sc.close();
	}
}
