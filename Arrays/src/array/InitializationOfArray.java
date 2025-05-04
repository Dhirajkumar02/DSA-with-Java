package array;

public class InitializationOfArray {
	public static void main(String[] args) {
		//Initialization and Declaration
		int[] arr = {10,20,30,40,50};
		System.out.print(arr[0]+" ");
		System.out.print(arr[1]+" ");
		System.out.print(arr[2]+" ");
		System.out.print(arr[3]+" ");
		System.out.println(arr[4]+" ");
		
		System.out.println("----------------");
		//Declaration and array creation
		int[] x = new int[5];
		//System.out.println(x);
		x[0]=10;
		x[1]=20;
		x[2]=30;
		x[3]=40;
		x[4]=50;
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
		
		System.out.println("=============");
		//Traverse the array
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
			
		}
		
	}

}
