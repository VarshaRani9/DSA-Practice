package Integer1D;

public class MaxInSubArray {

	private static int[] max(int arr[],int k) {
		int n = arr.length;
		int ans[] = new int[n-k+1];
		for(int i =0;i<=n-k;i++) {
			int max = arr[i];
			for(int j=1;j<k;j++) {
				if(arr[i+j]>max) {
					max = arr[i+j];
				}
				ans[i]=max;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[] = {1,-2,4,7,1,3,8,3};
		int ans[] = max(arr,3);
		for(int ele: ans) {
			System.out.print(ele+" ");
		}
	}
}