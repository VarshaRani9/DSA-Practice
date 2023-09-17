public class Substraction {

	private static int[] sub(int arr1[], int arr2[]) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		int max = Math.max(n1, n2);
		int[] res = new int[max];
		int i = n1-1, j = n2-1, k = max-1;
		int borrow = 0;
		while(i>=0 || j>=0) {
			int ans = 0;
			if(i>=0 && j>=0) {
				ans = arr1[i]-borrow-arr2[j];
				if(ans<0)borrow=1;
				else borrow = 0;
				res[k--]= (ans>=0)?ans:ans+10;
				i--;j--;
			}
			else if(i>=0) {
				ans = arr1[i]-borrow-arr2[j];
				if(ans<0)borrow=1;
				res[k--]= (ans>=0)?ans:ans+10;
				i--;
			}
			else {
				ans = arr1[i]-borrow-arr2[j];
				if(ans<0)borrow=1;
				res[k--]= (ans>=0)?ans:ans+10;
				j--;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int arr1[] = {6,5,9,3,6,2};
		int arr2[] = {3,7,8,2,1,4};
		int grt = 1;
		if(arr1.length==arr2.length) {
			if(arr1[0]>arr2[0])grt=1;
			else grt=2; 
		}
		int res[] = (grt == 1)?sub(arr1,arr2):sub(arr2,arr1);
		System.out.print(" ");
		for(int e : arr1)System.out.print(e+" ");
		System.out.println();
		System.out.print("-");
		for(int e : arr2)System.out.print(e+" ");
		System.out.println();
		System.out.println("---------------");
		System.out.print(" ");
		for(int e : res)System.out.print(e+" ");
	}
}
