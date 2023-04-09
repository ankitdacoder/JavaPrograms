package MockTest;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Greetings {


	int calculate(int i1, int i2) {
		return i1 + i2;
	}

	double calculate(byte b1, byte b2) {
		return b1 % b2;
	}

	String msg = null;

	public Greetings() {
		// this("Good Morning!");
	}

	public Greetings(String str) {
		msg = str;
	}

	public void display() {
		System.out.println(msg);
	}

	static String str = "KEEP IT "; // Line n1

	public static void main(String[] args) {
		
		String s4="";
		System.out.println(s4);
		int ob[] = {0, 3, 6, 8, 10};
		System.out.print(ob instanceof Object);
		int age = 3;
		do {
		System.out.print(age + " ");
		age -= 1;
		} while (age != 0);
		
		
		int String = 0; //line 1
		System.out.println("Ankit"+10 + 2 + "Mangos");
		float[] f1 = new float[4];
		
		 int number = 88_5;
		String hdd, laptop = "Acer";
		System.out.println("hdd "+laptop);
		double x = Math.round ( 5.552);
		System.out.println(x);
		
		System.out.println(new StringBuilder("zelda")== new StringBuilder("zelda"));
				System.out.println(3 == 3);
				System.out.println("bart" == "bart");
				System.out.println(new int[0] == new int[0]);
				System.out.println(LocalTime.now() == LocalTime.now());
		
		
		
		
		
		List list;
		list = new ArrayList<>(); //Line n1
		list.add("A");
		list.add("E");
		list.add("I");
		list.add("O");
		list.add("U");
		list.addAll(list.subList(0, 4)); //Line n2
		System.out.println(list);
		
		List fruits = new ArrayList<>();
		fruits.add(null);
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("grape");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("grape");

		//if(fruits.remove("grape"))
		//fruits.remove("apple");

		System.out.println(fruits.remove(1));
		
		String str = "java";
		StringBuilder sb = new StringBuilder("java");

		System.out.println(str.equals(sb) + ":" + sb.equals(str));
		
		String str1 = " ";
		boolean b1 = str1.trim().isEmpty();
		System.out.println(b1);
		
		
		
		
		
		
	//	StringBuilder sb = new StringBuilder("SpaceStation");
	//	sb.delete(5, 6).insert(5, " S").toString().toUpperCase();
	//	System.out.println(sb);

		LocalDate joiningDate = LocalDate.parse("2006-03-16");
		System.out.println(joiningDate.withDayOfYear(15));
		System.out.println("withDayOfMonth "+joiningDate.withDayOfMonth(1));
		System.out.println("withMonth "+joiningDate.withMonth(1));
		System.out.println("withYear "+joiningDate.withYear(2012));
		
		
		LocalTime time = LocalTime.of(23, 59);
		
		LocalDate date = LocalDate.of(2012, 1, 11);
		Period period = Period.ofMonths(2);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
		System.out.print(formatter.format(date.minus(period)));
		
		
		Greetings g1 = new Greetings();
		Greetings g2 = new Greetings("Good Evening!");
		g1.display();
		g2.display();

		double price = 90000;
		String model = null;
		if (price > 100000) {
			model = "Tesla Model X";
		} else if (price <= 100000) {
			model = "Tesla Model S";
		}
		System.out.println(model);

	}
}
