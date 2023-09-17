public class AddEleOf2Arrays {

	private static int[] add(int arr1[], int arr2[]) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		int max = Math.max(n1, n2);
		int[] res = new int[max+1];
		int i = n1-1, j = n2-1, k = max;
		int carry = 0;
		while(i>=0 || j>=0) {
			int ans = 0;
			if(i>=0 && j>=0) {
				ans = arr1[i]+arr2[j]+carry;
				int temp = ans/10;
				res[k--]=ans%10;
				if(temp==0 )carry = 0;
				else carry = 1;
				i--;j--;
			}
			else if(i>=0) {
				ans = arr1[i]+carry;
				int temp = ans/10;
				res[k--]=ans%10;
				if(temp==0 )carry = 0;
				else carry = 1;
				i--;
			}
			else {
				ans = arr2[j]+carry;
				int temp = ans/10;
				res[k--]=ans%10;
				if(temp==0 )carry = 0;
				else carry = 1;
				j--;
			}
		}
		res[k] = carry;
		return res;
	}
	public static void main(String[] args) {
		int arr1[] = {6,8,9,3,6,2};
		int arr2[] = {3,7,8,2,1,4};
		int res[] = add(arr1,arr2);
		System.out.print("  ");
		for(int e : arr1)System.out.print(e+" ");
		System.out.println();
		System.out.print(" +");
		for(int e : arr2)System.out.print(e+" ");
		System.out.println();
		System.out.println("---------------");
		for(int e : res)System.out.print(e+" ");
	}

}
