package string;

import java.util.Stack;

public class ReversalOfSentence {

	private static String reverse(String s) {
		String ans = "";
		Stack<String> stack = new Stack<>();
		String arr[] = s.split(" ");
		for(String ele : arr) {
			stack.push(ele);
		}
		while(!stack.isEmpty()) {
			ans+=stack.peek()+" " ;
			stack.pop();
		}
		return ans;
	}
	private static String reverse2(String s) {
		String ans = "";
		String arr[] = s.split(" ");
		for(int i =arr.length-1;i>=0;i--) {
			ans+=arr[i]+" ";
		}
		return ans;
	}
	private static String reverse3(String s) {
		int i =0;
		int j = s.length()-1;
		char temp ='\0';
		char []word = s.toCharArray();
		while(i<j) {
			temp = word[i];
			word[i] = word[j];
			word[j] = temp;
			i++;
			j--;
		}
		return String.valueOf(word);
	}
	public static void main(String[] args) {
		System.out.println(reverse("the sky is blue"));
		System.out.println(reverse2("the sky is blue"));
		
		String wholeString = reverse3("the sky is blue");
		String words[] = wholeString.split(" ");
		String sentence = "";
		for(String word : words) {
			sentence += reverse3(word)+" ";
		}
		System.out.println(sentence);
	}

}
