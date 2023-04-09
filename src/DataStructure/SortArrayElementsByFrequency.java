package DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class SortArrayElementsByFrequency {

	public static void main(String[] args) {

		int[] array = { 7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3 };

		HashMap<Integer, Integer> mapFre = new HashMap<Integer, Integer>();

		for (int i : array) {
			if (mapFre.containsKey(i)) {
				mapFre.put(i, mapFre.get(i) + 1);
			} else {
				mapFre.put(i, 1);
			}

		}

		ArrayList<Entry<Integer, Integer>> list = new ArrayList<>(mapFre.entrySet());

		System.out.println(list);
		
		 Collections.sort(list, new Comparator<Entry<Integer, Integer>>() 
         {
             @Override
             public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) 
             {
                 return o2.getValue().compareTo(o1.getValue());
             }
         }
);
		 
			System.out.println(list);

			for(Entry<Integer, Integer> entry:list)
			{
				 int freqency= entry.getValue();
				 
				 while(freqency>=1)
				 {
					 System.out.println(entry.getKey()+" ");
					 freqency--;
				 }
			}
			
			
		
	}

}
