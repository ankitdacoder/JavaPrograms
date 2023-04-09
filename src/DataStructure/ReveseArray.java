package DataStructure;

public class ReveseArray {

	public static void main(String[] args) {

		int[] array = { 12, 2, 3, 4, 5, 2 };

		/*
		 * int temp = 0; int n = array.length;
		 * 
		 * for (int i = 0; i < n / 2; i++) {
		 * 
		 * temp = array[i]; array[i] = array[n - i - 1]; array[n - i - 1] = temp;
		 * 
		 * }
		 */
		array = reverseArray(array, 0, array.length - 1);

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);
		}

	}

	public static int[] reverseArray(int arr[], int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		return arr;
	}

}
