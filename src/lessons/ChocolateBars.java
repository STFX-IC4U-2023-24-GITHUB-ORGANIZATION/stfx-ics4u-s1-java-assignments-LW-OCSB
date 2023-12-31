package lessons;

public class ChocolateBars {

	public static void main(String[] args) {

		
		// variables
		int rows = 5;
		int cols = 2;
		final double TAX_RATE = 0.13;
		double retailValue = 0.0;
		double retailValueWithTax = 0.0;
		int numBars = 0;
		
		double[][] inventory = new double[rows][cols];
		
		// Kit Kat
		inventory[0][0] = 42;
		inventory[0][1] = 2.49;
		
		// Snickers
		inventory[1][0] = 10;
		inventory[1][1] = 3.99;
		
		// Mars Bars
		inventory[2][0] = 96;
		inventory[2][1] = 1.99;
		
		// Aero
		inventory[3][0] = 30;
		inventory[3][1] = 3.27;
		
		// Twix
		inventory[4][0] = 25;
		inventory[4][1] = 4.20;
		
		
		// Total number of chocolate bars
		for (int i=0; i<rows; i++)  {
			
			numBars = numBars + (int)inventory[i][0];
		}

		System.out.println("Total Number Bars: " + numBars);
		
		
		// Total Retail Value of Inventory
		for (int i=0; i<rows; i++)  {
			
			retailValue = retailValue + (inventory[i][0]  * inventory[i][1]);
		}
	
		System.out.println("Total Value of Inventory: $" + retailValue);
		
		
		//Total Retail Value with Tax
		retailValueWithTax = retailValue + (retailValue * TAX_RATE);
		
		System.out.println("Total Value of Inventory with Tax: $" + retailValueWithTax);
		
	}

}
