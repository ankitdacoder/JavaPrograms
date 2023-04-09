package DataStructure;

import java.util.Arrays;

public class CheckArrayEqual {

	public static void main(String[] args) {

		int [] array1= {1,2,3,4};
		int [] array2= {1,2,4,3};
		
		sortArray(array1);
		sortArray(array2);
		
		
		boolean isEql=true;
		
		System.out.println(Arrays.equals(array1,array2));
	
		if(array1.length==array2.length)
		{
			for(int i=0;i<array1.length;i++)
			{
				if(array1[i]!=array2[i])
				{
					isEql=false;
				}
			}
			
		}else
		{
			System.out.println("Array Not Equal!");
		}
		
		System.out.println(isEql);
		
	}
	
	public static int[] sortArray(int[] array)
	{
		int temp=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if (array[i] > array[j]) {

					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		return array;
		
	}
	

}
