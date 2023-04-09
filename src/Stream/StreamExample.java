package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		
		
		
		Student s1=new Student("Ankit", "IN");
		Student s2=new Student("Bipin", "BP");
		Student s3=new Student("Vijay", "UP");
		Student s4=new Student("Aity", "IN");
		Student s5=new Student("Nisha", "IN");
		
		List<Student> slist= new ArrayList<Student>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		slist.add(s5);
		
		Predicate<Student> checkCityIn = city->city.getCity().equalsIgnoreCase("In");
		
		Predicate<Student> checkCityBp = city->city.getCity().equalsIgnoreCase("UP");
						
				
		List<Student> flist= slist.stream()
				      //.filter(stu->stu.getCity().equalsIgnoreCase("BP"))
		         .filter(stu->stu.getName().startsWith("V"))
		         .filter(checkCityIn.or(checkCityBp))     
				 .collect(Collectors.toList());
		System.out.println(flist);
		
		/*
		
		List<String> strList = Arrays.asList("Ankit", "Amit", "Anuj", "Aashi", "Hamed", "Sobha","Sri");
		long count = strList.stream().filter(x -> !x.isEmpty()).count();
		System.out.println("Empty String Count "+count);
		
		List<String> activeList=strList.stream().filter(x->x.equalsIgnoreCase("1")).collect(Collectors.toList());
		activeList.stream().forEach(p->System.out.println(p));
		
		
		List<String> filterNameList = strList.stream().sorted(
                Comparator.comparing(n->n.toString())).collect(Collectors.toList());

		filterNameList.stream().forEach(p->System.out.println(p));
		
		
		String upperCaseList=strList.stream().map(l->l.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(upperCaseList);
		
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
     
		List<Integer> numbersQList=numbers.stream().map(q->q*q).distinct().collect(Collectors.toList());
		
		numbersQList.stream().forEach(p->System.out.println(p));
		
		
		if(90 >= 90)
		{
			System.out.println("false");
		}else
		{
			System.out.println("true");
		}
		
		*/
	}

}
