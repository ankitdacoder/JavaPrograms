package HashMap;

import java.util.HashMap;
import java.util.Optional;

public class TestHashmap {

	public static void main(String[] args) {

		if (109 <= 114 && 109 >= 101) {
			System.out.println("Yest");
		}

		HashMap<Employee, Integer> map = new HashMap<>();

		Employee e1 = new Employee("Ankit", 25);
		Employee e2 = new Employee("Shivani", 27);
		

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
       
		
		map.put(e1, 1001);
		map.put(e2, 1002);
		
        System.out.println("Check HashCode "+map.get(e1));

        System.out.println("Check HashCode "+map.get(e2));
		
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
       


		Optional<Integer> a = Optional.ofNullable(null);

		if (a.isPresent()) {

		}

		Optional<Integer> b = Optional.of(null);
		if (b.isPresent()) {

		}

	}

}
