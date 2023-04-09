package Itrator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListItrator {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Ankit");
		list.add("Verma");
		list.add("Verma");
		list.add("Verma");
		list.add("Verma");
		
		System.out.println(list);
		
		ListIterator listItrator=list.listIterator();
		int count =1;
		while(listItrator.hasNext())
		{
			if(listItrator.next()=="Verma")
			{
				listItrator.add("Verma"+count);
			}
			
			count++;
		}
		
		System.out.println(list);
		
		
	}

}
