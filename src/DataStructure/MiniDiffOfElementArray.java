package DataStructure;

import java.util.Arrays;

public class MiniDiffOfElementArray {

	public static void main(String[] args) {

		int[] array= {5, 8, 4, 2, 9, 0};
		Arrays.sort(array);
		int min=Math.abs(array[1]-array[0]);
		int firstPair=array[0];
		int sendPair=array[1];
		
		for(int i=2;i<array.length;i++)
		{
			if(Math.abs(array[i]-array[i-1])<min)
			{
				min=Math.abs(array[i]-array[i-1]);
				firstPair=array[i];
				sendPair=array[i-1];
			}
		}
		
		
		System.out.println("Minimum Diff is "+min);
		System.out.println("First Pair "+firstPair+" secondPair "+sendPair);
	}

}
