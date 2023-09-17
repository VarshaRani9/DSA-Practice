// Leetcode 189 - Rotate Array

class Solution {
    private void reverse(int []arr,int low, int high) {
		while(low<high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
  
    public void rotate(int[] a, int rot) { 
      int n = a.length;
      rot=rot%n;
      if(n==1 || rot ==0 || rot==n)return;
      reverse(a,0,n-rot-1);
	    reverse(a,n-rot,n-1);
	    reverse(a,0,n-1);
    }
}
