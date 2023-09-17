// Question: Given an array of integers, find the maximum bitwise AND value of any two integers in the array.
// Input: [3, 5, 8, 10, 12]
// Output: 8
// Explanation: The maximum bitwise AND value of any two integers in the array is 8, which is the result of the bitwise AND operation between 10 (1010 in binary) and 12 (1100 in binary).

public class MaximumOfAND {

	private static int maxOfAnd(int []arr) {
		int max = 0;
		for(int i =0;i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if((arr[i]&arr[j])>max)max = (arr[i]&arr[j]);
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[] = {3, 5, 8, 10, 12};
		System.out.println("Max Of AND :"+maxOfAnd(arr));
	}

}
