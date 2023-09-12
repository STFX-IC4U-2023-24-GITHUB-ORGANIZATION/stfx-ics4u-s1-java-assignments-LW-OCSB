package lessons.vehicle;

public class TestCar {

	public static void main(String[] args) {
	
		
		// create new instance of car using default construtor:
		Car car1 = new Car();
		
		// create new instance of car using parameterized construtor:
		Car car2 = new Car("gas", "blue", 4, true, "standard");
		
		
		System.out.println(car1);
		car1.setFuelType("diesel");
		car1.setColour("red");
		car1.setMaxPass(4);
		car1.setHasMotor(true);
		car1.setTransmission("automatic");
		System.out.println(car1.getFuelType());
		System.out.println(car1.getColour());
		System.out.println(car1.getMaxPass());
		System.out.println(car1.getHasMotor());
		System.out.println(car1.getTransmission());
		System.out.println(car2);
	}

}
