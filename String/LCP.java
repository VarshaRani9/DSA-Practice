package string;

public class LCP {

	private static int minLen(String arr[]) {
		int min = arr[0].length();
		for(int i =1;i<arr.length;i++) {
			if(arr[i].length()<min)min = arr[i].length();
		}
		return min;
	}
	private static String lcp(String []arr) {
		int minlen = minLen(arr);
		String ans = "";
		for(int i =0;i<minlen;i++) {
			char cur = arr[0].charAt(i);
			for(int j =1;j<arr.length;j++) {
				if(arr[j].charAt(i)!=cur) {
					return ans;
				}
			}
			ans += cur+"";
			
		}
		return ans;
	}
	public static void main(String[] args) {
		String arr[] = {"lists","listen", "listes"};
		String res = lcp(arr);
		System.out.println(res==""?"No longest Common Prefix":"Common Prefix : "+res);
	}

}
