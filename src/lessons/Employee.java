package lessons;

public class Employee {

	// Data Member
	private String name = "";
	String birthDate = "";
	String position = "";
	
	
	// Default Constructor
	public Employee()  {
		
		this.name = "Name TBD.";
		this.birthDate = "Birthdate TBD.";
		this.position = "Position TBD";
		
	}
	
	// Parameterized Constructor
	public Employee(String n, String bd, String p)  {
		
		this.name = n;
		this.birthDate = bd;
		this.position = p;
	}
	
	// get methods
	
	// get name
	public String getName()  {
		
		return this.name;
	}
	
	// get birthDate
	public String getBirthDate()  {
			
		return this.birthDate;
	}
	
	// get getPosition
	public String getPosition()  {
			
		return this.position;
	}
	
	// set methods
	
	
	// set name
	public void setName(String n)  {
		
		this.name = n;
	}
	
	// set birthDate
	public void setBirthDate(String b)  {
		
		this.birthDate = b;
	}
	
	// set position
	public void setPosition(String p)  {
		
		this.position = p;
	}

	// Over-ride .toString() method
	@Override
	public String toString()  {
		
		
		return super.toString() + this.name + "." + this.birthDate + "."+ this.position;
	}
	
	
}
