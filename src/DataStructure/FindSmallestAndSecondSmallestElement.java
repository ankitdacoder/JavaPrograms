package DataStructure;

public class FindSmallestAndSecondSmallestElement {

	public static void main(String[] args) {

		int[] array = { 17, 11, 23, 64, 41, 88, 35 };

		int small, smallest;

		if (array[0] > array[1]) {

			small = array[0];
			smallest = array[1];

		} else {
			smallest = array[0];
			small = array[1];

		}

		for (int i = 2; i < array.length; i++) {

			if (array[i] < small) {
				small = smallest;
				smallest = array[i];
			} else if (array[i] > small && array[i] < smallest) {
				smallest = array[i];
			}

		}

		System.out.println("Smallest " + smallest + " Small " + small);

	}

}
