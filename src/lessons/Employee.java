package lessons;

public class Employee {

	// Data Member
	private String name = "";
	String birthDate = "";
	String position = "";
	
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
	
}
