package bits;

public class SingleEleInArray {

	public static void main(String[] args) {
		int arr[] = {10,20,30,30,40,40,10,50,50};
		int res = 0;
		for(int i =0;i<arr.length;i++) {
			res= res^arr[i];
		}
		System.out.println(res);
	}

}
