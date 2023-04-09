package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class FindFrequncyArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 1, 1 };

		HashMap<Integer, Integer> mapFre = new HashMap<Integer, Integer>();

		for (int i : array) {
			if (mapFre.containsKey(i)) {
				mapFre.put(i, mapFre.get(i) + 1);
			} else {
				mapFre.put(i, 1);
			}

		}
		System.out.println(mapFre);

		int maxFrq = 0;
		int freNumber = 0;
		for (Map.Entry<Integer, Integer> mmm : mapFre.entrySet()) {
			if (mmm.getValue() > maxFrq) {
				maxFrq = mmm.getValue();
				freNumber = mmm.getKey();
			}
		}

		System.out.println("Maximu Fre Number : " + freNumber);
		System.out.println("Maximu Frequency : " + maxFrq);

	}

}
