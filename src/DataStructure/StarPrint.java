package DataStructure;

public class StarPrint {

	public static void main(String[] args) {

		
//		for(int i=0;i<6;i++)
//		{
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//		
//		System.out.println(" Right  ");   
		int row=6;
		for(int i=0;i<row;i++)
		{
		
		
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		int n=5;
		  for (int i=0; i<n; i++) //outer loop for number of rows(n) 
		{
			for (int j = n - i; j > 1; j--) // inner loop for spaces
			{
				System.out.print("-"); // print space
			}
			for (int j = 0; j <= i; j++) // inner loop for number of columns
			{
				System.out.print("* "); // print star
			}

			System.out.println(); // ending line after each row
		} 
		  
		  System.out.println();
		  
		 for(int i=0;i<4;i++)
		 {
			 
			 for(int j=2*(4-i);j>0;j--)
			 {
				 System.out.print(" ");
			 }
			 
			 for(int j=0;j<=i;j++)
			 {
				 System.out.print("* ");
			 }
			 
			 System.out.println("-");
		 }
		  
		
	}

}
