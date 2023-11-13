package lessons;

public class HelloWorldRecursive {

	public static void main(String[] args) {
	
		System.out.println(helloWorldRecursive(13));

	}

	
	public static String helloWorldRecursive(int n)  {
		
		// error case, we don't want negative number
		if (n < 1)  {
			
			return "";
		}
		
		// stop case
		else if (n == 1)  {
			
			return "Hello World!\n";
		}
			
		// smallest problem, then pass the buck and combine
		else {
			
			return "Hello World!\n" + helloWorldRecursive(n - 1);
			
		}
		
	}
	
	
}
