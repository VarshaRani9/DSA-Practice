public class ThirdLargest {

	private static int thirdLargestEle(int arr[]) {
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int ThirdLargest = Integer.MIN_VALUE;
		if(arr.length<=2) {
			System.out.println("Array contains less than 3 elements");
		}
		else {
			for(int i =0;i<arr.length;i++) {
				if(arr[i]>firstLargest) {
					ThirdLargest = secondLargest;
					secondLargest = firstLargest;
					firstLargest = arr[i];
				}
				else if(arr[i]<firstLargest && arr[i]>secondLargest) {
					ThirdLargest = secondLargest;
					secondLargest = arr[i];
				}
				else if(arr[i]<secondLargest && arr[i]>ThirdLargest) {
					ThirdLargest = arr[i];
				}
			}
		}
		return ThirdLargest;
	}
	public static void main(String[] args) {
		int arr[] = {10,40,39,78,54,22,9,99};
		int res = thirdLargestEle(arr);
		System.out.println("3rd Largest element is : "+res);
	}

}
