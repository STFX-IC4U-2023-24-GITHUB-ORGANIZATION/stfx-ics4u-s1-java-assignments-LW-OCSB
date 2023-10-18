package lessons;

// import for ArrayLists
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		// ArrayLists for cars (rows)
		ArrayList<String> car1 = new ArrayList();
		ArrayList<String> car2 = new ArrayList();
		ArrayList<String> car3 = new ArrayList();
		ArrayList<String> car4 = new ArrayList();
		
		// ArrayList of of cars (ArrayLists)
		ArrayList<    ArrayList<String>      > carCollection = new ArrayList();
		
		
		
		// Car 1 Information
		car1.add("Volkswagon");
		car1.add("Westfalia");
		car1.add("1987");
		car1.add("White");
		car1.add("X1234ABCF9");
		
		// Car 2 Information
		car2.add("Toyota");
		car2.add("Yaris");
		car2.add("2001");
		car2.add("Blue");
		car2.add("Y1234ABCF9");
		
		// Car 3 Information
		car3.add("Nissan");
		car3.add("Juke");
		car3.add("2017");
		car3.add("Black");
		car3.add("A1234ABCF9");
		car3.set(1, "Pathfinder");
		
		// Car 4 Information
		car4.add("RX7");
		car4.add("1999");
		car4.add("Yellow");
		car4.add("C1234ABCF9");
		car4.add(0, "Mazda");
		
		// Add cars to carCollection
		carCollection.add(car1);
		carCollection.add(car2);
		carCollection.add(car3);
		carCollection.add(car4);
		
		// One way to print all cars
		for (int i=0; i<carCollection.size(); i++)  {
			System.out.println(carCollection.get(i));
		}
		
		System.out.println("\n\n");
		
		// More detailed way to print car elements
		for (int i=0; i<carCollection.size(); i++)  {
			
			for (int j=0; j<car1.size(); j++)  {
				
				System.out.println(carCollection.get(i).get(j) + " ");
			}
			System.out.println("\n");
		}
		
		
		

	}

}
