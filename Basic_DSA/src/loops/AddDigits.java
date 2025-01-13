/* Given an integer num, repeatedly add all its digits until the result has only 
	one digit, and return it.(LeetCode)
*/
package loops;
import java.util.Scanner;
public class AddDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		System.out.println(addDigits(num));
		sc.close();
	}
	public static int addDigits(int num) {
        int sum =0;
        num = Math.abs(num);
        while(num != 0){
            int digit = num%10;
            sum += digit;
            num /= 10;
        }
        if(sum < 10){
            return sum;
        }else{
            return addDigits(sum);
        }
        
    }

}
