import java.util.Stack;

public class NextSmaller {

	private static int[] nextSm(int[] arr) {
		int res[] = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		for(int i=arr.length-1;i>=0;i--) {
			while(!stack.isEmpty() && stack.peek()>=arr[i]) {
				stack.pop();
		    }
			if(stack.isEmpty())res[i] = -1;
			else if(stack.peek()<arr[i]) res[i]=stack.peek();
			stack.push(arr[i]);
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[] = {5,1,2,3,9,6,1,4,3};
		int res[] = nextSm(arr);
		for(int ele: res) {
			System.out.print(ele+" ");
		}
	}

}
