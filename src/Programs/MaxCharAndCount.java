package Programs;

import java.util.HashMap;
import java.util.Map;

public class MaxCharAndCount {

	public static void main(String[] args) {

		String s = "aabccc";
		Map<Character, Integer> map = new HashMap<>();

		char[] ch = s.toCharArray();

		for (Character c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);

			}
		}

		int maxCount = 0;

		// Iterating over values only
		for (Integer value : map.values()) {

			if (maxCount < value) {
				maxCount = value;
			}

		}

		System.out.println("Value = " + maxCount);
	}

}
