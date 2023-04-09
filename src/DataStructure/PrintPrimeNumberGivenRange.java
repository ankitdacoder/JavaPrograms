package DataStructure;

public class PrintPrimeNumberGivenRange {

	public static void main(String[] args) {
		
		
		
		System.out.println(15*3+"Ankit");
		System.out.println("Ankit"+15*3);
		
		
		int max = 3;
		for (int n = 1; n <= max; n++) {
		
			if (isPrimeNumber(n)) {
				System.out.println(n);
			}
		}

	}

	public static boolean isPrimeNumber(int num) {

		if (num < 2) {
			return false;
		}

		for (int i = 2; i < num / i; ++i) {
			if ( num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
