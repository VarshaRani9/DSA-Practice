// Leetcode : 2133. Check if Every Row and Column Contains All Numbers

class Solution {
    public boolean checkValid(int[][] matrix) {
        Set<Integer> set = new HashSet<>();
        int n = matrix.length;
        // row
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                set.add(matrix[i][j]);
            }
            if(set.size()!=n)return false;
            set.clear();
        }
        // col
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                set.add(matrix[j][i]);
            }
            if(set.size()!=n)return false;
            set.clear();
        }
        return true;
    }
}
