package string;

public class ComputeWeight {

	static int[] wgt(String pattern) {
		int []weightArr = new int[pattern.length()];
		int len = 0;
		int j =1;
		weightArr[0]=0;
		while(j<pattern.length()) {
			if(pattern.charAt(j)==pattern.charAt(len)) {
				len++;
				weightArr[j]= len;
				j++;
			} 
			else {
				if(len!=0)len = weightArr[len-1];
				else {
				weightArr[j]=0;
				j++;
				}
			}
		}
		return weightArr;
	}
	public static void main(String[] args) {
		String s = "ababcababeab";
		int[] res = wgt(s);
		for(int e : res) {
			System.out.print(e+" ");
		}
	}

}
