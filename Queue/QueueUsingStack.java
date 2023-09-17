import java.util.Stack;

class qUsingStack {
	Stack<Integer> s1;
	Stack<Integer> s2;
	public qUsingStack(){
		s1 = new Stack<>();
		s2 = new Stack<>();
	}
	void enque(int data) {
		s1.push(data);
	}
	void deque() {
		if(s1.isEmpty())return;
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s2.pop();
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	int front() {
		if(s1.isEmpty())return -1;
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		int ans = s2.peek();
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return ans;
	}
	int rear() {
		return s1.peek();
	}
	boolean isEmpty() {
		return s1.isEmpty();
	}
}
public class QueueUsingStack {
	
	public static void main(String[] args) {
		qUsingStack ob = new qUsingStack();
		ob.enque(10);
		System.out.println(ob.front());
		ob.enque(20);
		ob.enque(30);
		System.out.println(ob.rear());
		System.out.println(ob.front());
		ob.deque();
		System.out.println(ob.front());
		System.out.println(ob.rear());
		ob.enque(40);
		System.out.println(ob.rear());
	}

}
