// Leetcode : 2022. Convert 1D Array Into 2D Array

class Solution {
    public int[][] construct2DArray(int[] arr, int n, int m) {
      if(m*n!=arr.length)return new int[0][0];
			int res[][] = new int[n][m];
			int row=0,col=0;
			for(int i =0;i<arr.length;i++) {
				res[row][col] = arr[i];
				col++;
				if(col==m) {
					col=0;
					row++;
			}
		}
		return res;
  }
}
