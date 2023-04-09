package SuperKeyWord;

class A {
	
	int a = 10;

	A()
	{
		System.out.println("Class A constru");
	}
	
	A(int a)
	{
		System.out.println("Parameter Con "+ a);
	}
	
	void m1()
	{
		System.out.println("M1 method called");
	}
}

class B extends A {
	int a = 20;

	B(){
	//	super();
		super(101);
	}
	
	public void show(int a) {
		//super.m1();
		System.out.println("Passed Value " + a);
		System.out.println(this.a);
		System.out.println(super.a);
	}

}

public class TestSuperKey {

	public static void main(String[] args) {

		B b = new B();
		b.show(30);

	}

}
