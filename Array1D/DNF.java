public class DNF {

	public static void main(String[] args) {
		char arr[] = {'R','B','W','B','W','R','R','W','B'};
		int n = arr.length;
		System.out.print("Before :");
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		int low = 0,mid = 0, high = n-1;
		char temp = 0;
		for(int i =0;i<n;i++) {
			if(arr[mid]=='R') {
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				mid++;
				low++;
			}
			else if(arr[mid]=='W') {
				mid +=1;
			}
			else if(arr[mid]=='B') {
				temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
		System.out.print("\nAfter: ");
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
