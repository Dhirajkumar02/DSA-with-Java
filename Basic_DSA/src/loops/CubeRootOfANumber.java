package loops;

import java.util.Scanner;

public class CubeRootOfANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.println(cubeRoot(n));
		sc.close();
	}
	// Using Predefined method
//	public static int cubeRoot(int n) {
//		return (int)Math.cbrt(n);
//	}

	static int cubeRoot(int n) {
	      int low = 0, high = n;
	        while (low <= high) {
	            int mid = (low + high) / 2; // 
	            long cube = (long) mid * mid * mid;
	            if (cube == n) {
	                return mid;
	            } else if (cube < n) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        return high; 
	        }
}
