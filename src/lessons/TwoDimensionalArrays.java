package lessons;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		
		// array of arrays
		// like a spreadsheet (rows and columns)
		// 2 identifiers, first is "rows", second is "colums"
		
		/*
		 SYNTAX: 
		 dataType[][] arrayIdentifier = new dataType[rowSize][columnSize]; 
		 */
		
		// Examples:
		int[][] myIntegerArray = new int[3][3];
		String[][] myStringArray = new String[3][3];
		Employee[][] myEmployeeArray = new Employee[4][4];
		
		// Alternative method to create 2-D Array in 2 steps:
		// May use this method in Object Oriented Programming
		double[][] myDoubleArray;
		myDoubleArray = new double[3][3];
		
		myDoubleArray[0][0] = 17.1;
		myDoubleArray[0][1] = 5.1;
		myDoubleArray[0][2] = 6.1;
		myDoubleArray[1][0] = 12.1;
		myDoubleArray[1][1] = -5.1;
		myDoubleArray[1][2] = 7.1;
		myDoubleArray[2][0] = 13.1;
		myDoubleArray[2][1] = 10.1;
		myDoubleArray[2][2] = 8.1;
		
		// To access contents of 2D Array:
		System.out.println(myDoubleArray[1][1]);
		
		// 2D Array Methods:
		
		// Number of rows:
		System.out.println(myDoubleArray.length);
		
		// Number of columns:
		System.out.println(myDoubleArray[0].length);
		
		
		for(int i=0; i<myDoubleArray.length; i++)  {
			
			for (int j=0; j<myDoubleArray[0].length; j++)  {
				System.out.println(myDoubleArray[i][j]);
			}
		}
	}

}
