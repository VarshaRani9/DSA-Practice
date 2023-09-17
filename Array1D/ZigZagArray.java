public class ZigZagArray {

	public static void main(String[] args) {
		int arr [] ={4,3,7,8,6,2,1,7,5};
		System.out.print("Initial Array : ");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		int n = arr.length;
		for(int i =0;i<n-1;i++) {
			int temp = 0;
			if(i%2==0) {
				if(arr[i]>arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1]=temp;
				}
			}
			else {
				if(arr[i]<arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		System.out.print("\nUpdated Array : ");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
