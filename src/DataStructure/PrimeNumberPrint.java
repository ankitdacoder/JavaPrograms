package DataStructure;

public class PrimeNumberPrint {

	public static void main(String[] args) {

		int temp = 0;
		for (int i = 1; i < 5; i++) {

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					temp = temp + 1;
				}

			}

			if (temp == 0) {
				System.out.println("Prime Number " + i);
			} else {
				temp = 0;
			}

		}

	}

}
