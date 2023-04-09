package DataStructure;

public class FindMissingNumber {

	public static void main(String[] args) {

		int array[] = {6,1,2,8,3,4,7,10,5};

		int n = array.length+1;
		int total = ((n * (n + 1)) / 2);

		for(int num:array)
		{
			total=total-num;
		}

		System.out.println("Missing Number : " + total);

	}

}
