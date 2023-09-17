import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

//	Approach 1 - USING STACK
	public static void reverse(Queue<Integer> q) {
		Stack<Integer> s = new Stack<>();
		while(!q.isEmpty()) {
			s.push(q.poll());
		}
		while(!s.isEmpty()) {
			q.offer(s.pop());
		}
	}
	
//	Approach -2 - Recursive
	public static void reverse2(Queue<Integer> q) {
		if(q.isEmpty())return;
		int front = q.poll();
		reverse2(q);
		q.offer(front);
		
	}
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		System.out.println("Original : "+q);
		reverse(q);
		System.out.println("Original : "+q);
		reverse2(q);
		System.out.println("Original : "+q);
	}

}
