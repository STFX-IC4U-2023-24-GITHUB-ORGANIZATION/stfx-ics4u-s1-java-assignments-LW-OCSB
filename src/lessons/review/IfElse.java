package lessons.review;

public class IfElse {

	public static void main(String[] args) {
		
		// will always execute
		if (2 < 1)  {
			
			System.out.println("Code block1 executed.");
		}
		
		else if (3 > 2)  {
			System.out.println("Code block2 executed.");
		}

		else if (4 < 1)  {
			System.out.println("Code block3 executed.");
		}
		
		else  {
			System.out.println("Default code executed");
		}
		
		System.out.println("End of program.");

	}

}
