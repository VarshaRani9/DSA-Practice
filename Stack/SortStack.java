import java.util.Stack;

public class SortStack {

	private static Stack<Integer> sort(Stack<Integer> stack){
		Stack<Integer> temp = new Stack<>();
		int cur = 0;
		while(!stack.isEmpty()) {
			cur = stack.pop();
			if(temp.isEmpty())temp.push(cur);
			else {
				while(!temp.isEmpty() && temp.peek()<cur) {
					stack.push(temp.pop());
				}
				temp.push(cur);
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(26);
		stack.push(7);
		stack.push(98);
		stack.push(45);
		stack.push(39);
		System.out.println(stack);
		Stack<Integer> res = sort(stack);
		System.out.println(res);
	}

}
