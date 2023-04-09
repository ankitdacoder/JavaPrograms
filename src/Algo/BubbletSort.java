package Algo;

public class BubbletSort {

	public static void main(String[] args) {

		
		int[] array = {5, 3, 1, 4, 2}; 
		int temp=0;
		for (int i = 0; i < args.length; i++) {
			
			for (int j = 0; j < array.length - i - 1; j++) 
			{

				if (array[j] > array[j + 1]) 
				{ 
					     temp = array[j]; 
						 array[j] = array[j + 1]; 
						 array[j + 1] = temp; 
					
				}
			}

		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	

}

	
