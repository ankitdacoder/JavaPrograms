package FunntionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestDemo {

	public static void main(String[] args) {
		
		//Predicate 
		Predicate<String> checkLenth=str->str.length()>5;
		System.out.println(checkLenth.test("Ankit1"));
		
	   //Consumer - modified the data
		Job j=new Job();
		j.setJobId("12345");
		
		Consumer<Job> setJob=t->t.setJobId("JOB12345");
		setJob.accept(j);
		System.out.println(j.getJobId());
		
		//Funtion Takes input and provide output
		Function<Integer, String> output=t->t*2+" After Multipliying";
		System.out.println(output.apply(10));
		
		
		//Supplier- no input only output
		Supplier<Double> randomNumber=()->getOtp();
		System.out.println(randomNumber.get());
		
	     	Runnable run= ()->{};
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static Double getOtp()
	{
		return Math.floor(1000 + Math.random() * 9000);
	}

}
