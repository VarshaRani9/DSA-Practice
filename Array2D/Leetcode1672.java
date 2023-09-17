// LEETCODE : 1672. Richest Customer Wealth

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int m = accounts.length;
        int n = accounts[0].length;
        int sum = 0;
        for(int i =0;i<m;i++){
            sum = 0;
            for(int j =0;j<n;j++){
                sum+=accounts[i][j];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}
