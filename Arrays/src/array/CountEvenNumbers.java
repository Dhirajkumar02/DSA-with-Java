// WAJP to count all the even numbers of the array
package array;
import java.util.Scanner;

public class CountEvenNumbers {

    // Method to count even numbers in the array
    public static int countEven(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
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

        // Step 3: Count and display even numbers
        int evenCount = countEven(arr);
        System.out.println("Total even numbers in the array: " + evenCount);

        sc.close();
    }
}
