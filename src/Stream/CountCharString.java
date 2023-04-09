package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharString {

	public static void main(String[] args) {

		String str = "aabbccd";
		
		Map<String, Long> countChar = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(">>> "+countChar);

		List<String> duplicateString = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(x -> x.getValue() > 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());

		System.out.println("duplicateString "+duplicateString);
		
		
		String key= Arrays.stream(str.split(""))
			  .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		      .entrySet()
		      .stream()
		      .filter(s->s.getValue()>1)
		      .findFirst().get().getKey();
		
		System.out.println("First Non Repeat Element "+key);
		
		int[] number= {3,4,24,56,76,33,11,1,121,0};
		
		

		List<Integer> sortedList= Arrays.stream(number)
				                         .boxed()
				                         .sorted(Comparator.reverseOrder())
				                         .collect(Collectors.toList());
		
		System.out.println("Sorted List "+sortedList);
		
		Integer listNumber= Arrays.stream(number)
				                         .boxed()
				                         .sorted(Comparator.reverseOrder())
				                         .skip(1)
				                         .findFirst().get();
		
		System.out.println("Second Highet Number in List {3,4,24,56,76,33} is "+listNumber);
		      
		String[] strArray= {"java","techie","springboot","microservice"};
		
		String lonestString= Arrays.stream(strArray)
		                           .reduce((str1,str2)->str1.length()>str2.length()?str1:str2)
		                           .get();
		
		System.out.println("Longest String "+lonestString);
		
	List<String> startWithOne=Arrays.stream(number)
		            .boxed()
		            .map(st->st+"")
		            .filter(st->st.startsWith("1"))
		            .collect(Collectors.toList());
	System.out.println("Start With 1 "+startWithOne);
	
	
	
	}

}
