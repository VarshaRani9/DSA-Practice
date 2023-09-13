package string;

public class PatternMatchingKMP {

	private static int[] wgt(String pattern) {
		int []weightArr = new int[pattern.length()];
		int len = 0;
		int j =1;
		weightArr[0]=0;
		while(j<pattern.length()) {
			if(pattern.charAt(j)==pattern.charAt(len)) {
				len++;
				weightArr[j]= len;
				j++;
			} 
			else {
				if(len!=0)len = weightArr[len-1];
				else {
				weightArr[j]=0;
				j++;
				}
			}
		}
		return weightArr;
	}
	private static int kmp(String txt, String pattern) {
		int i =0;
		int j =0;
		int[] weightArr = wgt(pattern);
		while(i<txt.length()) {
			if(txt.charAt(i)==pattern.charAt(j)) {
				i++;
				j++;
				if(j==pattern.length())return i-j;
			}
			else if(j==0)i++;
			else j = weightArr[j-1];
		}
		return -1;
	}
	public static void main(String[] args) {
		String s = "ababdabacdabab";
		String pattern = "abacd";
		System.out.println(kmp(s,pattern));
	}
}
