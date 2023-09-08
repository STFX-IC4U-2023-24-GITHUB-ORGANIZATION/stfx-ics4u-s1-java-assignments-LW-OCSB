package sandbox;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		
		// variables
		int number = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		number = sc.nextInt();
		
		System.out.println("You entered the number: " + number);
	}

}
