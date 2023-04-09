package MockTest;

public class Ex1 {

	public static void main(String[] args) {
       int i2=0;
		for (System.out.print(i2++); i2 < 2; System.out.print(i2++)) {
			System.out.print(i2);
		}

		outer: for (int i = 0; i < 3; System.out.print(i)) {
			i++;
			inner: for (int j = 0; j < 3; System.out.print(j)) {
				if (i > ++j) {
					break outer;
				}
			}
		}

		int i1 = 1;
		int j1 = 5;
		int k1 = 0;
		A: while (true) {
			i1++;
			B: while (true) {
				j1--;
				C: while (true) {
					k1 += i1 + j1;
					if (i1 == j1)
						break A;
					else if (i1 > j1)
						continue A;
					else
						continue B;
				}
			}
		}
		System.out.println(k1);

		int ctr = 100;
		one: for (int i = 0; i < 10; i++) {
			two: for (int j = 0; j < 7; j++) {
				three: while (true) {
					ctr++;
					if (i > j) {
						break one;
					} else if (i == j) {
						break two;
					} else {
						break three;
					}
				}
			}
		}
		System.out.println(ctr);

		String[][] arr1 = { { "%", "$$" }, { "***", "@@@@", "#####" } };
		for (String[] str : arr1) {
			for (String s : str) {
				System.out.println(s);
				if (s.length() == 4) // Line n1
					break; // Line n2
			}
			break; // Line n3
		}

		int elements = 0;
		Object[] ar = { "A", "E", new Object() }; // Line n1
		for (Object obj : ar) { // Line n2
			if (obj instanceof String) {
				continue;
			} else {
				break;
			}
			// elements++; //Line n3
		}
		System.out.println(elements); // Line n4

		boolean flag = false;
		System.out.println((flag = true) | (flag = false) || (flag = true));
		System.out.println(flag);

		System.out.println(true != false);

		boolean flag1 = true;
		boolean flag2 = false;
		boolean flag3 = true;
		boolean flag4 = false;

		System.out.println(!flag1 == flag2 != flag3 == !flag4); // Line n1
		System.out.println(flag1 = flag2 != flag3 == !flag4); // Line n2

		int x = 10; // Line n1
		if (false)
			System.out.println(x); // Line n2
		System.out.println("HELLO"); // Line n3

		String msg = "Hello";
		boolean[] flg = new boolean[2];
		System.out.println(">>" + flg[1]);
		if (flg[0]) {
			msg = "Welcome";
		}
		System.out.println(msg);

		// String [] arr = new String[7];

		char[][] arr = { { 'A', 'B', 'C' }, { 'D', 'E', 'F' }, { 'G', 'H', 'I' } };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][1]);
			}
			System.out.println();

		}

		int[] arr3 = { 1, 2, 3 };
		char[] arr4 = { 'A', 'B' }; // ASCII code of ‘A’ is 65, ‘B’ is 66
		// arr3 = arr4;
		// for(int i = 0; i < arr1.length; i++) { System.out.print(arr1[i] + " "); } } }

		int[] arrr = { 3, 2, 1 };
		for (int i : arrr) {
			System.out.println(arrr[i]);

		}
	}

}
