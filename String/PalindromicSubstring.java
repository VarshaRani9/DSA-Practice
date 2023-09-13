package string;

public class PalindromicSubstring {

	private static boolean palindrome(String s) {
		int n = s.length();
		for(int i =0;i<n/2;i++) {
			if(s.charAt(i)!=s.charAt(n-i-1))return false;
		}
		return true;
	}
	private static void substrings(String s) {
		for(int i =0;i<s.length();i++) {
			for(int j =i+1;j<s.length();j++) {
				String temp = s.substring(i,j);
				if(palindrome(temp))System.out.println(temp);
			}
		}
	}
	public static void main(String[] args) {
		String s = "abccbc";
		substrings(s);
	}

}
