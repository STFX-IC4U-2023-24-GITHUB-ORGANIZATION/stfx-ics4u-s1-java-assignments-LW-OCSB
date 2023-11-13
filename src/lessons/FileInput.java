package lessons;

import java.util.ArrayList;
import java.io.*;


public class FileInput {

	public static void main(String[] args) {
		
		ArrayList<String> colours = new ArrayList();
		String word = "";
		BufferedReader br = null;
		
		try  {
		
			// open file located under src folder, forced to use try-catch
			br = new BufferedReader(new FileReader("colours.txt"));
			
			// read contents of text file, line-by-line until end of file
			// add contents to ArrayList, forced to use try-catch
			while(    (word = br.readLine())   != null     )  {
				
				colours.add(word);
			}
			
			// close the file
			br.close();
		}
		
		catch (Exception e)  {
			
			e.printStackTrace();
		}
		
		// print contents of ArrayList
		for (int i=0; i<colours.size(); i++)  {
			System.out.println(colours.get(i));
		}
		
	}

	
	
}
