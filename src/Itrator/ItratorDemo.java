package Itrator;

import java.util.ArrayList;
import java.util.Iterator;

public class ItratorDemo {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("Ankit");
		list.add("Verma");
		//list.add(123);

		Iterator it = list.iterator();
		while (it.hasNext()) {
			if(it.next()=="Ankit")
			{
				it.remove();
				
			}
			System.out.println(it.next());
			
		}

	}

}
