package string;

import java.util.HashMap;

public class FirstUniqueChar {

	private static int firstUnique(String s) {
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(int i =0;i<s.length();i++) {
			if(map.get(s.charAt(i))==1)return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(firstUnique("lleetcode"));
	}

}
