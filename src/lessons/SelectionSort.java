package lessons;

import java.lang.reflect.Array;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] myIntArray = {39, 42, 73, 88, 12, 1, 24, 21, 13};
		
		sortHandOfInts(myIntArray, true);
		
		printIntArray(myIntArray);
	}

	
	public static void sortHandOfInts(int[] a, boolean ascending)  {
		
		for (int i=1; i<a.length; i++)  {
			
			int j = i;
			
			while (j > 0)  {
				
				if (ascending == true)  {  
					while (a[j] < a[j-1])  {
				
						swap(a, j, j-1);
					}
				}
				
				else  {  
					while (a[j] > a[j-1])  {
				
						swap(a, j, j-1);
					}
				}
				
				j--;
			}
		}
		
	}
	
	
	public static void swap(int[] a, int x, int y)  {
		
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	public static void printIntArray(int[] a)  {
		
		for (int i=0; i<a.length; i++)  {
			System.out.print(a[i] + " ");
		}
		
		System.out.println(" ");
	}
	
}
