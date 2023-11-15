
public class LinearSearch {

	// global variable 
	public static int counter = 0;
	
	
	public static void main(String[] args) {
		
		String[] unSortedArray = {"peach", "blue", "salmon", "brown", "green", 
				"orange", "purple", "red", "black", "white"};
		
		System.out.println(unsortedLinearSearch(unSortedArray, "brown"));
		System.out.println("Looked at this many things: " + counter);
		
	}

	// DESCRIPTION - Returns true if search pattern is found at least once
	//				 inside array.
	// PARAMETERS - String[] array, String pattern
	// RETURN TYPE - boolean
	public static boolean unsortedLinearSearch(String[] array, String pattern)  {
		
		for(int i=0; i<array.length; i++)  {
			
			if (array[i].equals(pattern))
				return true;
		}
		
		return false;
		
		// PROBLEM - entire list has to be searched if element is not inside
	}
	
	
}
