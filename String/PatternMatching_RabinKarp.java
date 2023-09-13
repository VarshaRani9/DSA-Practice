package string;

public class PatternMatching_RabinKarp {

	private static long hash(String pattern) {
		long hashVal = 0;
		for(int i =0;i<pattern.length();i++) {
			hashVal += pattern.charAt(i)*Math.pow(10,i);
		}
		return hashVal;
	}
	private static int rabinKarp(String txt, String pattern) {
		int txtLen = txt.length();
		int patternLen = pattern.length();
		long patternHash = hash(pattern);
		long txtHash = hash(txt.substring(0,patternLen));
		for(int i =0;i<txtLen-patternLen;i++) {
			if(patternHash == txtHash && pattern.equals(txt.substring(i,i+patternLen)))return i;
			if(i<txtLen-patternLen)txtHash = hash(txt.substring(i,i+patternLen));
		}
		return -1;
	}
	public static void main(String[] args) {
		String txt = "abcabcabdabe";
		String pattern = "abda";
		System.out.println(rabinKarp(txt,pattern));
	}

}
