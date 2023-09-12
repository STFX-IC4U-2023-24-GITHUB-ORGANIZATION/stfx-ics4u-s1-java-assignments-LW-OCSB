package lessons.vehicle;

public class Car extends Vehicle   {

	// data member
	private String transmission;
	
	// DESCRIPTION: default constructor 
	// PARAMETER LIST: na
	// RETURN TYPE: Car 
	public Car() {
	
		super();	
		transmission = "";
	}
	
	// DESCRIPTION: parameterized constructor 
	// PARAMETER LIST: String fuelType, String colour, int maxPass, boolean hasMotor, String trans
	// RETURN TYPE: Car 
	public Car(String ft, String c, int mp, boolean hm, String t) {
	
		// LONG WAY:
		//this.fuelType = ft;
		//this.colour = c;
		//this.maxPass = mp;
		//this.hasMotor = hm;
		
		// Reuse Code!
		super(ft, c, mp, hm);

		// New code:
		this.transmission = t;
	}
	
	// get methods
	public String getTransmission()  {

		return this.transmission;
	}
	
	// set methods
	public void setTransmission(String t)  {
		
		this.transmission = t;
	}
	
	
	@Override
	public String toString()  {
		
		return super.toString() + "." + this.transmission;
	}
}
