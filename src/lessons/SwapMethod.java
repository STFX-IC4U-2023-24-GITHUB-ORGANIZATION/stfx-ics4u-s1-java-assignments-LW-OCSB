package lessons;

public class SwapMethod {

	public static void main(String[] args) {

		// variables
		int x = 13;
		int y = 7;
		
		// swap within main method
		int temp = 0;
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);


		int a = 12;
		int b = 17;
		
		swap(a, b);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		int[] myArray = {13, 7};
		
		swapElements(myArray, 0, 1);
		
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		
		
	}
	
	// DESCRIPTION - swaps integers (this won't change variables)
	// PARAMETERS - int x, int y
	// RETURN TYPE - void
	public static void swap(int x, int y)  {
		
		int temp = 0;
		temp = x;
		x = y;
		y = temp;
		
	}
	
	// DESCRIPTION - Swaps array elements x and y.
	// PARAMETERS - int[] a, int x, int y
	// RETURN TYPE - void
	public static void swapElements(int[] a, int x, int y)  {
		
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;	
	}
	

}
