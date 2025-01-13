package loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(get(a,b));
		sc.close();
		
	}
	static List<Integer> get(int a, int b){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(b);
		list.add(a);
		return list;
	}

}
