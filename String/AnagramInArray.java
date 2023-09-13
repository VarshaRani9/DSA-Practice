package string;

import java.util.Arrays;

public class AnagramInArray {

	private static void isAnagram1(String [] arr) {
		String words[] = arr.clone();
		int index = 0;
		for(String word: words) {
			char[] array = word.toCharArray();
			Arrays.sort(array);
			words[index] = String.valueOf(array);
			index++;
		}
		for(int i =0;i<words.length;i++) {
			if(i<words.length-1 && words[i].equals(words[i+1])) {
				System.out.println(arr[i]+" "+arr[i+1]);
			}
		}
	}
	public static void main(String[] args) {
		String arr[] = {"act", "cat", "word", "god", "diog"};
		isAnagram1(arr);
	}

}
