import java.util.Arrays;
import java.util.Scanner;

public class NthLargestElement {

	private static int NthLargestEle(int arr[],int n) {
		if(n>arr.length) {
			System.out.println("Array contains only "+arr.length+" element");
			System.exit(0);
		}
		Arrays.sort(arr);
		return arr[arr.length-n];
	}
	public static void main(String[] args) {
		int arr[] = {10,40,39,78,54,22,9};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n = sc.nextInt();
		int res = NthLargestEle(arr,n);
		String pos = "";
		if(n==1)pos = "st";
		else if(n==2)pos = "nd";
		else if(n==3)pos = "rd";
		else pos = "th";
		System.out.println(n+pos+" Largest element is :"+res);
		sc.close();
	}

}
