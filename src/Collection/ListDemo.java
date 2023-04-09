package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListDemo {

	public static void main(String[] args) {

		// list preserve oder
		// list can contain duplicate value

		List<String> list = new ArrayList<>();
		list.add("Ankit");
		list.add("Verma");
		list.add("Ankit");
		list.add(null);

		list.remove("Ankit");

		list.forEach(str -> {
			System.out.println(str);
		});

		List<Employee> emplist = new ArrayList<Employee>();

		emplist.add(new Employee("Ankit", 2000,"Indore"));
		emplist.add(new Employee("Jiya", 3000,"Bhopal"));
		emplist.add(new Employee("Anand", 7000,"Surat"));
		emplist.add(new Employee("Kittu", 5000,"Mumbai"));
		emplist.add(new Employee("Priya", 8000,"Pune"));
		emplist.add(new Employee("Anand", 7000,"Bhopal"));
		
		Collections.sort(emplist, (e1, e2) -> (e1.getSalary() - e2.getSalary()));

		System.out.println("Sort By Salary "+ emplist);
		System.out.println();
		Collections.sort(emplist, (e1, e2) -> (e1.getName().compareTo(e2.getName())));
		System.out.println("Sor By Employee Name "+emplist);
		System.out.println();
		emplist.add(new Employee("Ziya", 5000,"Pune"));
		
		emplist.sort(Comparator.comparing(Employee::getName));
		System.out.println("Sorted By Empoyee Name : "+emplist);
		
		emplist.sort(Comparator.comparing(Employee::getCity));
		System.out.println("Sorted By City Name : "+emplist);
		
		emplist.sort(Comparator.comparing(Employee::getName)
				.thenComparing(Employee::getCity));
		
		System.out.println("Sorted By Employee Name and then City Name : "+emplist);
		
		
		emplist.sort(Comparator.comparing(Employee::getSalary).reversed());
		System.out.println("Sort Employee By Salary Comparator : "+emplist);
		
		
		
		
		Map<String,List<Employee>> listToMap= emplist.stream().collect(Collectors.groupingBy(Employee::getName));
		
		listToMap.forEach((key,value)->{
		
			System.out.println("Key : "+key+" value : "+value );
			
		});
		
		
		
	  List<Employee> empWithSalMoreThn5k=	emplist.stream().filter(emp->emp.getSalary()>5000).collect(Collectors.toList());
		
	  empWithSalMoreThn5k.forEach(emp->{System.out.println(emp);});
		
	}

}
