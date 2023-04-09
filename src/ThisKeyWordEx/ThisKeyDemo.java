package ThisKeyWordEx;

class Test {

	int number;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

}


public class ThisKeyDemo {

	public static void main(String[] args) {

		Test t=new Test();
		t.setNumber(1000);
		System.out.println("Number is : "+t.getNumber());
	}

}
