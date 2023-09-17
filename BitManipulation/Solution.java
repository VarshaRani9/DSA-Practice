// Given an integer A find the Ath number whose binary representation is a palindrome.
// NOTE:
// •	Consider the 1st number whose binary representation is palindrome as 1, instead of 0
// •	Do not consider the leading zeros, while considering the binary representation.

public class Solution {
    private static boolean isPalindrome(int n){
        String str = Integer.toBinaryString(n);
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1))return false;
        }
        return true;
    }
    public static int solve(int A) {
        int ans = 1;
        int i = 1;
        while(A>0){
            if(isPalindrome(i)){
                ans = i;
                A--;
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
		System.out.println("Number : "+solve(9));
	}
}
