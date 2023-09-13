package string;

public class SuffixPrefix {

	private static String[] prefix(String s) {
		int n = s.length();
		String arr[] = new String[n];
		for(int i =0;i<n;i++) {
			arr[i] = s.substring(0,i+1);
		}
		return arr;
	}
	private static String[] suffix(String s) {
		int n = s.length();
		String arr[] = new String[n];
		for(int i =0;i<n;i++) {
			arr[i] = s.substring(n-1-i);
		}
		return arr;
	}
	public static void main(String[] args) {
		String s = "apple";
		String []arr = suffix(s);
		for(String st : arr) {
			System.out.print(st+ " ");
		}
		System.out.println();
		String []res = prefix(s);
		for(String str : res) {
			System.out.print(str+ " ");
		}
	}

}
