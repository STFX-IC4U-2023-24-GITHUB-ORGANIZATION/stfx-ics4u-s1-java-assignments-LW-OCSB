package lessons;

public class EmployeeTest {

	public static void main(String[] args) {
	
		
		// Variable declarations
		
		// short-cut to create common String object
		String myString = "43r324r";
		
		// how to create an instance of an ojbect
		String myString2 = new String("some text");

		// create new Employee object
		Employee employee1 = new Employee();
		
		// set data for new Employee
		employee1.setName("John Curley");
		employee1.setBirthDate("September 13, 2005");
		employee1.setPosition("French Fry Guy");
		
		// get data from new Employee
		System.out.println(employee1.getName());
		System.out.println(employee1.getBirthDate());
		System.out.println(employee1.getPosition());
		
		
		// Create another Employee Object
		Employee employee2 = new Employee();
		
		// get data from second Employee
		System.out.println(employee2.getName());
		System.out.println(employee2.getBirthDate());
		System.out.println(employee2.getPosition());
		
		// Create a third Employee Object
		Employee employee3 = new Employee("Adam Peever", "July 28, 2006", "French Fry Guy");
		
		// get data from third Employee
		System.out.println(employee3.getName());
		System.out.println(employee3.getBirthDate());
		System.out.println(employee3.getPosition());
	
		System.out.println("\n\n\n");
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println("\n\n\n");
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		System.out.println(employee3.toString());
		
		
	}

}
