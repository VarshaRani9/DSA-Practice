package string;

public class PatternMatchingNaive {

	private static int naivePatternMatching(String text, String pattern) {
		int n = text.length();
		int m = pattern.length();
		for(int i =0;i<n-m;i++) {
			int j =0;
			while(j<m && text.charAt(i+j) == pattern.charAt(j)) {
				j++;
			}
			if(j==m)return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		String text = "abcdabccba";
		String pattern = "bccb";
		System.out.println(naivePatternMatching(text,pattern));
	}

}
