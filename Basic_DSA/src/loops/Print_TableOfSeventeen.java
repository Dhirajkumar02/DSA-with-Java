package loops;

public class Print_TableOfSeventeen {
	public static void main(String[] args) {
		// This code will execute 172 times
		for (int i = 17; i<=170; i+=1) {
			if (i % 17 == 0) {
				System.out.println((i));
			}	
		}
		
		System.out.println("-----------");
		
		// This code will execute 10 times
		for(int i = 17; i<=170; i+=17) {
			System.out.println(i);
		}
	}

}
