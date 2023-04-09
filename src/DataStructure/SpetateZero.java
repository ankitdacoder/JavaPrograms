package DataStructure;

public class SpetateZero {

	public static void main(String[] args) {

		int[] array = { 12, 0, 7, 0, 8, 0, 3 };
		int temp = 0;
		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == 0) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
