package string;

import java.util.ArrayList;
import java.util.List;

public class LCS {

	private static List<String> subsequence(String str) {
		ArrayList<String> list = new ArrayList<>();
		int n = str.length();
		for(int i =0;i<n;i++) {
			char first = str.charAt(i);
			if(list.size()==0) {
				list.add("");
				list.add(""+first);
				continue;
			}
			int subLen = list.size();
			for(int j =0;j<subLen;j++) {
				String temp = list.get(j)+first;
				list.add(temp);
			}
		}
		return list;
	}
	private static String lcs(String s1, String s2) {
		String res = "";
		List<String> l1 = subsequence(s1);
		List<String> l2 = subsequence(s2);
		for(String word1 : l1) {
			for(String word2 : l2) {
				if(word1.equals(word2) && res.length()<word1.length())res = word1;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "axbrcd";
		System.out.println(lcs(str1,str2));
	}

}
