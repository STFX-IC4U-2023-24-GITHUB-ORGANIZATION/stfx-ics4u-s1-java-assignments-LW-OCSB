package lessons;

public class BubbleSort {

	public static void main(String[] args) {

		int[] myArray = {6, 3, 1, 4, 0, 5, 2, 7};
		
		boolean swapped = true;

		while (swapped == true)  {
			
			swapped = false;
		
			// code to keep passing, comparing and swapping
			for (int i=0; i<myArray.length-1; i++)  {
				
				if (myArray[i] > myArray[i+1])  {
					
					swap(myArray, i, i+1);
					swapped = true;
				}
			}
		}
		
		// print sorted array
		for (int i=0; i<myArray.length; i++)  {
			
			System.out.print(myArray[i] + " ");
		}
		
	}

	
	public static void swap(int[] a, int x, int y)  {
		
		int temp = a[x];
		
		a[x] = a[y];
		a[y] = temp;
	}
	
}
