package FinlaKeyWord;

 class A
{
    void m1()
   	{
   		System.out.println("Class A m1 method");
   	}
 
}

class B extends A
{
  
	void m1() //Cannot override the final method from A
	{
		System.out.println("Class B m1 method");
	}

}


public class TestFinalKeyDemo {

	public static void main(String[] args) {

		//final variable example
		final int a=10;
		//a=a+10;
		System.out.println(a);
		
		B b=new B();
		b.m1();
		
		
		
	}

}
