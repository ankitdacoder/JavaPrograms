package DataStructure;

public class FindPairOfElement {

	public static void main(String[] args) {

		int[] array = {4, -5, 9, 11, 25, 13, 12, 8};
		int number = 20;

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] + array[j] == number) {
					System.out.println("Pair Is " + array[i] + " and " + array[j]);
				}
			}
		}

	}

}
