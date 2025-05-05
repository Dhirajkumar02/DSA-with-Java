package methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        // Swap using method
        List<Integer> swap = get(a, b);
        System.out.println("After Swapping:");
        System.out.println("First Number: " + swap.get(0));
        System.out.println("Second Number: " + swap.get(1));

        sc.close();
    }

    // Method to return swapped numbers in a list
    public static List<Integer> get(int a, int b) {
        List<Integer> list = new ArrayList<>();
        list.add(b); // b becomes first
        list.add(a); // a becomes second
        return list;
    }
}
