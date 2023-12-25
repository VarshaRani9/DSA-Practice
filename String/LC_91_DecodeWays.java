class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        if(n == 0 || s.charAt(0) == '0') return 0;
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            // check for single-digit
            if(s.charAt(i - 1) >= '1' && s.charAt(i - 1) <= '9') dp[i] = dp[i - 1];
            // check for two-digits
            if(s.charAt(i - 2) == '1') dp[i] += dp[i - 2];
            else if(s.charAt(i - 2) == '2' && s.charAt(i - 1) >= '0' && s.charAt(i - 1) <= '6') dp[i] += dp[i - 2];
        }
        return dp[n];
    }
}
