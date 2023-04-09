package Exception;

public class TestExcp1 {

	public static void main(String[] args)   {

		
		try {
			
			System.out.println(print());
		} catch (Exception e) {
			System.out.println("Age not allowed");
		}
		
		System.out.println("I am here");
	}

	
	//@SuppressWarnings("finally")
	public static int print() throws Exception 
	{
	//	System.out.println(10/2);
	//	System.out.println(10/1);
		
		
		int age=10;
		if(age<18)
		{
			 throw new Exception();
		}
		
		return 1;
		
		//System.out.println(10/3);
	}
}
