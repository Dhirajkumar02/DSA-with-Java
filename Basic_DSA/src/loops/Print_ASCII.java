//write a java program to print all the ASCII values and their equivalent 
// character of 26 alphabets using while loop

package loops;

public class Print_ASCII {
	public static void main(String[] args) {
//		for(int i = 65; i<=90; i++) {
//			System.out.println(i + " "+(char)i);
//		}
//		System.out.println("----------");
//		for(int i = 97; i<=122; i++) {
//			System.out.println(i + " "+(char)i);
//		}
		
		// Using While loop
		char ch = 'A';
		while(ch <= 'Z' ) {
			System.out.println(ch+ " "+(int)ch);
			ch++;
		}
		System.out.println("---------");
		ch = 'a';
		while(ch <= 'z' ) {
			System.out.println(ch+ " "+(int)ch);
			ch++;
		}
	}

}
