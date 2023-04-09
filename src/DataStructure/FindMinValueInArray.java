package DataStructure;

public class FindMinValueInArray {

	public static void main(String[] args) {

		int[] array = { 2, 5, 7, 5, 3 };
		
		int minValue = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}
		System.out.println("MinValue "+minValue);
		
		int maxValue=array[0];
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]>maxValue)
			{
				maxValue=array[i];
			}
		}
		
		System.out.println("maxValue "+maxValue);
		
		int frstMaxValue,scndMaxValue;
		if(array[0]>array[1])
		{
			frstMaxValue=array[0];
			scndMaxValue=array[1];
		}else
		{
			frstMaxValue=array[1];
			scndMaxValue=array[0];
		}
		
		for (int i = 2; i < array.length; i++) {
			if(array[i]<frstMaxValue)
			{  
				frstMaxValue=scndMaxValue;
				scndMaxValue=array[i];
				
			}else
			if(array[i]<scndMaxValue && array[i]>frstMaxValue)
			{
				scndMaxValue=array[i]; 
			}
		}
		
		System.out.println(scndMaxValue);

	}

}
