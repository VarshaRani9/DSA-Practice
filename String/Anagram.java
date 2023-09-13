package string;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

	private static boolean isAnagram1(String s1, String s2) {
		if(s1.length()!=s2.length())return false;
		char arr[] = s1.toCharArray();
		Arrays.sort(arr);
		s1 = new String(arr);
		char arr2[] = s2.toCharArray();
		Arrays.sort(arr2);
		s2 = new String(arr2);
		if(s1.equals(s2))return true;
		return false;
	}
	private static boolean isAnagram2(String s1, String s2) {
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i =0;i<s1.length();i++) {
			if(!map.containsKey(s1.charAt(i)))
			map.put(s1.charAt(i), 1);
			else map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
		}
		for(int i =0;i<s2.length();i++) {
			if(!map.containsKey(s2.charAt(i)))return false;
			else if(map.get(s2.charAt(i))==1)map.remove(s2.charAt(i));
			else map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
		}
		if(map.isEmpty())return true;
		return false;
	}
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		System.out.println(isAnagram1(s1,s2));
		System.out.println(isAnagram2(s1,s2));
	}

}
