package LeetCode;

import java.util.HashMap;

public class SumTwo {

	public static void main(String[] args) {
 
		int target =6;
		int nums[]=  {3, 3};
		/*		
		int a[] = new int[2];

		for (int i = 0; i < nums.length; i++) {

			for (int j=1; j<=nums.length-1; j++) {

				if (nums[i] + nums[j] == target) {
					a[0] = i;
					a[1] = j;
					break;
				}

			}
			break;
		}
		
		System.out.println(a[0]);

		System.out.println(a[1]);
		
		*/
		
		System.out.println(twoSum(nums,18)[0]);
		System.out.println(twoSum(nums,18)[1]);
		

	}
	
	 public static int[] twoSum(int[] nums, int target) {

	        HashMap<Integer, Integer> map = new HashMap();
	        
	        /* 2, 7, 11, 15  ==  target=9
	         * 0  1   2   3  => 4
	         *  
	         *    --HasMap--
	         *  key   value(index)
	         *   2  ->  0
	         *   7  ->  1
	         *
	        */
	        for(int i=0; i<nums.length; i++) {
	           int expectedKey = target - nums[i];
	           if(map.containsKey(expectedKey)) {
	               return new int[]{map.get(expectedKey), i};
	           }
	           map.put(nums[i], i);
	        }
	             
	        throw new IllegalArgumentException("No Solution");
	    }

}
