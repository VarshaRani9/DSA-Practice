import java.util.Stack;

public class NextGreater {

	private static int[] nextGrtr(int[] arr) {
		int res[] = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		for(int i=arr.length-1;i>=0;i--) {
			while(!stack.isEmpty() && stack.peek()<=arr[i]) {
				stack.pop();
			}
			if(stack.isEmpty())res[i]=100;
			else if(stack.peek()>arr[i])res[i]=stack.peek();
			stack.push(arr[i]);
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[] = {5,1,2,3,9,6,1,4,3};
		int res[] = nextGrtr(arr);
		for(int ele: res) {
			System.out.print(ele+" ");
		}
	}

}
