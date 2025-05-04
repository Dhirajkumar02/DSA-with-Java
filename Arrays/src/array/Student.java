package array;

public class Student {
	public static void main(String[] args) {
		int[] marks = { 89, 45, 56, 78, 12, 34, 78, 15 };
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < 35)
				System.out.println(i);
		}
	}

}
