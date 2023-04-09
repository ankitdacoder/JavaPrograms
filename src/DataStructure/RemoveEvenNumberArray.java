package DataStructure;

public class RemoveEvenNumberArray {

	public static void main(String[] args) {

		int[] array = { 3, 4, 2, 75, 3, 2, 5, 9 };

		int temp = 0;
		int length = array.length;
		for (int i = 0; i < length / 2; i++) {
			temp = array[i];
			array[i] = array[length - i - 1];
			array[length - i - 1] = temp;

		}

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}

		int oddCount = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 != 0) {
				oddCount++;
			}

		}

		int[] oddArray = new int[oddCount];
		int oddIndex = 0;
		System.out.println(oddArray);

		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 != 0) {
				oddArray[oddIndex] = array[i];
				oddIndex++;
			}

		}

		for (int a : oddArray) {
			System.out.println(a);
		}

	}

}
