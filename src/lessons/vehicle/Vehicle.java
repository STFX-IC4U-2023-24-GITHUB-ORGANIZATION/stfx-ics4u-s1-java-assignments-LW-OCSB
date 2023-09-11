package lessons.vehicle;

public abstract class Vehicle {

	// data members
	private String fuelType;
	private String colour;
	private int maxPass;
	private boolean hasMotor;
	
	
	// DESCRIPTION: default constructor 
	// PARAMETER LIST: na
	// RETURN TYPE: Vehicle 
	public Vehicle() {
		
		fuelType = "";
		colour = "";
		maxPass = 0;
		hasMotor = false;		
	}
	
	// DESCRIPTION: parameterized constructor
	// PARAMETER LIST: (String fuelType, String colour, int maxPass, boolean hasMotor)
	// RETURN TYPE: Vehicle
	public Vehicle(String ft, String c, int mp, boolean hm)  {
		
		this.fuelType = ft;
		this.colour = c;
		this.maxPass = mp;
		this.hasMotor = hm;
	}
	
	
	// get methods
	public String getFuelType()  {
		
		return this.fuelType;
	}
	
	public String colour()  {

		return this.colour;
	}
	
	public int maxPass()  {
		
		return this.maxPass;
	}
	
	public boolean hasMotor()  {
		
		return this.hasMotor;
	}
	
	
	// set methods
	public void setFuelType(String ft)  {
		
		this.fuelType = ft;
	}
	
	public void setColour(String c)  {
		
		this.colour = c;
	}
	
	public void maxPass(int mp)  {
		this.maxPass = mp;
	}
	
	public void setHasMotor(boolean hm)  {
		this.hasMotor = hm;
	}
	
	@Override
	public String toString()  {
		
		String str = "";
		
		str = super.toString() + "." + this.fuelType + "." + this.colour + "."
				+ this.maxPass + "." + this.hasMotor;
				
		return str;
	}
}
