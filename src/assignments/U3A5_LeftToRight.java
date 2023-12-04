package assignments;

public class U3A5_LeftToRight {
	
	public static void main(String[] args) {

		// variables
		int[] intArray = {6, 4, 7, 0, 1, 2, 9, 8, 5};
		String[] stringArray = {"cat", "horse", "mouse", "chicken", "dog", "fish", "snake", "cow"};
				
		// sort integers ascending
		leftToRightInts(intArray, true);
		printIntArray(intArray);
			
		// sort integers descending
		leftToRightInts(intArray, false);
		printIntArray(intArray);
			
		// sort Strings ascending
		leftToRightStrings(stringArray, true);
		printStringArray(stringArray);
					
		// sort Strings descending
		leftToRightStrings(stringArray, false);
		printStringArray(stringArray);
			
		/*  EXPECTED OUTPUT:
			 
	    0 1 2 4 5 6 7 8 9 
		9 8 7 6 5 4 2 1 0 
		cat chicken cow dog fish horse mouse snake 
		snake mouse horse fish dog cow chicken cat 
	 
		*/
			
	}

		
	// DESCRIPTION - Sorts integer array ascending (true) or descending (false) directions.
	// PARAMETERS - int[] a, boolean ascending
	// RETURN TYPE - void
	public static void leftToRightInts(int[] a, boolean ascending)  {
			
		// TO BE COMPLETED
	}
		
		
	// DESCRIPTION - Sorts String array ascending (true) or descending (false) directions.
	// PARAMETERS - String[] a, boolean ascending
	// RETURN TYPE - void
	public static void leftToRightStrings(String[] a, boolean ascending)  {
			
		// TO BE COMPLETED
	}
		
		
	// DESCRIPTION - Prints contents of integer array.
	// PARAMETERS - int[] a
	// RETURN TYPE - void
	public static void printIntArray(int[] a)  {
			
		// TO BE COMPLETED
	}
		
		
	// DESCRIPTION - Prints contents of String array.
	// PARAMETERS - String[] a
	// RETURN TYPE - void
	public static void printStringArray(String[] a)  {
			
		// TO BE COMPLETED
	}
		
		
	// DESCRIPTION - Swaps int array elements x with y.
	// PARAMETERS - int[] a, int x, int y
	// RETURN TYPE - void
	public static void swap(int[] a, int x, int y)  {
		
		// TO BE COMPLETED
	}
		
		
	// DESCRIPTION - Swaps String array elements x with y.
	// PARAMETERS - String[] a, int x, int y
	// RETURN TYPE - void
	public static void swap(String[] a, int x, int y)  {
			
		// TO BE COMPLETED
	}

}