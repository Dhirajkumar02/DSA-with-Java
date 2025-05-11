// WAJP to print the even elements of the array

package array;
import java.util.Scanner;

public class EvenElement {
    
    // Method to print even elements
    public static void printEvenElements(int[] arr) {
        System.out.println("Even elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Element at index " + i + ": " + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Step 2: Input array elements
        int[] arr = new int[size];
        System.out.println("Enter " + size + " array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Print even elements
        printEvenElements(arr);

        sc.close();
    }
}
