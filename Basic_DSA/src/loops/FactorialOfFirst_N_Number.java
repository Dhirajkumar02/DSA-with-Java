// 	WAP to print the factorial of first 'n' numbers
package loops;
import java.util.Scanner;

public class FactorialOfFirst_N_Number {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		long fact = 1;
		System.out.println("Factorial of first "+n+" numbers: ");
		for (int i = 1; i <= n; i++) {
			fact *= i;
			System.out.println("Factorial of "+i+ " is "+fact);
		}
		sc.close();
	}

}
