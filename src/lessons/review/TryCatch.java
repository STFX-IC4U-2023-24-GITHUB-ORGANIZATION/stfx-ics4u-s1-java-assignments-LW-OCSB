package lessons.review;

import java.util.Scanner;


public class TryCatch {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		int myInt = 0;
		
		
		// input
		System.out.println("Enter an integer: "); 

		// try-catch block
		try  {
			myInt = sc.nextInt();
		}
		
		catch (Exception e)  {

			//e.printStackTrace();	
			System.out.println("Hello World!");
		}
		
		
		// output
		System.out.println("You entered: " + myInt);
		
		

	}

}
