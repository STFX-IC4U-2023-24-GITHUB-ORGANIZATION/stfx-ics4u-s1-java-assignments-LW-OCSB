package lessons;

import java.util.ArrayList;
import java.io.*;

public class FileOutput {

	public static void main(String[] args) {

		// array variable
		String[] food = {"milk", "bread", "butter", "cheese", "yogurt"};
		
		try {
		
			// create output file
			FileOutputStream fout = new FileOutputStream("C:\\Users\\e28166\\Desktop\\food.txt");
			
			// load file into memory
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			OutputStreamWriter out = new OutputStreamWriter(bout);
		
			// write contents into file
			for (int i=0; i<food.length; i++)  {
				out.write(food[i] + "\n");
			}
		}
		
		catch (Exception e)  {
			e.printStackTrace();
		}		
		
	}

}
