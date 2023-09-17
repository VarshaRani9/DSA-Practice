// Leetcode : 2319. Check if Matrix Is X-Matrix

class Solution {
    public boolean checkXMatrix(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if((i==j || i+j==n-1) && matrix[i][j]==0){
                    return false;
                }
                else if((i!=j && i+j!=n-1) && matrix[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
}
