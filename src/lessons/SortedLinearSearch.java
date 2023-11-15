package lessons;

import java.lang.reflect.Array;

public class SortedLinearSearch {

	// global variable
	public static int counter = 0;
	
	public static void main(String[] args) {
		
		// sorted array
		String[] sortedArray = {"black", "blue", "brown", "green", "orange", 
				"peach", "purple", "red", "salmon", "white"};
		
		System.out.println(sortedLinearSearch(sortedArray, "coral"));	
		System.out.println(counter);
	}

	// DESCRIPTION - Returns true if search pattern is found at least once
	//				 inside array.
	// PARAMETERS - String[] sortedArray, String pattern
	// RETURN TYPE - boolean
	public static boolean sortedLinearSearch(String[] sortedArray, String pattern)  {
		
		for (int i=0; i<sortedArray.length; i++)  {
			
			counter++;
			
			// match is found, return true, exit method
			if (sortedArray[i].compareTo(pattern) == 0)
				return true;
			
			else if (sortedArray[i].compareTo(pattern) > 0)
				return false;
			
		}
		
		return false;
	}
	
	
}
