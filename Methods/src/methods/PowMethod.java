package methods;

public class PowMethod {
	public static void main(String[] args) {
		System.out.println(Math.pow(5, 2));
		System.out.println(Math.sqrt(3.14));
		System.out.println(Math.cbrt(3.14));
		System.out.println(Math.abs(-6));
		System.out.println(Math.floor(3.14));
		System.out.println(Math.max(5, 8));
		System.out.println(Math.min(4.5, 3.9));
		int a =5, b=7 , c=9, d=6;
		System.out.println(Math.max(a, Math.max(b, c)));
		System.out.println(Math.max(a, Math.max(b, Math.max(c, d))));
	}

}
