package string;

import java.util.ArrayList;

public class Subsequence {

	public static void main(String[] args) {
		String str = "abcd";
		ArrayList<String> list = new ArrayList<>();
		int n = str.length();
		for(int i =0;i<n;i++) {
			char first = str.charAt(i);
			if(list.size()==0) {
				list.add(" ");
				list.add(""+first);
				continue;
			}
			int subLen = list.size();
			for(int j =0;j<subLen;j++) {
				String temp = list.get(j)+first;
				list.add(temp);
			}
		}
		System.out.println(list);
	}

}
