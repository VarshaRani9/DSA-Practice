package string;

public class RunningLenEncoding {

	private static void RLE(String s) {
		String ans = "";
		int n = s.length();
		for(int i = 0;i<n;i++) {
			int count = 1;
			while(i<n-1 && s.charAt(i)==s.charAt(i+1)) {
				i++;
				count++;
			}
			ans=ans+s.charAt(i)+count;
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		String s = "aaaabbbccccdd";
		RLE(s);
	}

}
