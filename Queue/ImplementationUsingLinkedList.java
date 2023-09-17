class LL{
	class Node2{
		int data;
		Node2 next;
		public Node2(int data) {
			this.data = data;
		}
	}
	Node2 front=null, rear = null;
	
	boolean isEmpty() {
		return front==null;
	}
	void enque(int data) {
		Node2 newNode = new Node2(data);
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		}
		else {
			rear.next = newNode;
			rear = newNode;
		}
	}
	int deque() {
		if(isEmpty())return -1;
		int data = front.data;
		front = front.next;
		return data;
	}
	int getFront() {
		return front.data;
	}
	int getRear() {
		return rear.data;
	}
}

public class ImplementationUsingLL {	
	
	public static void main(String[] args) {
		LL obj = new LL();
		obj.enque(10);
		obj.enque(20);
		System.out.println(obj.getRear());
		obj.enque(30);
		System.out.println(obj.getRear());
		System.out.println(obj.getFront());
		System.out.println(obj.deque());
		System.out.println(obj.getFront());
		obj.enque(40);
		System.out.println(obj.getRear());
	}

}
