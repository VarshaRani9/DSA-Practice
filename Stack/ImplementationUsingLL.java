package stack;

import java.util.EmptyStackException;

public class ImplementationUsingLL {

	private Node top;
	private int size;
	
	private class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public ImplementationUsingLL() {
		top = null;
		size = 0;
	}
	void push(int val) {
		Node newNode = new Node(val);
		newNode.next = top;
		top = newNode;
		size++;
	}
	int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int popped =  top.data;
		top = top.next;
		size--;
		return popped;
	}
	int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	boolean isEmpty() {
		if(size==0)return true;
		return false;
	}
	int size() {
		return size;
	}
	public static void main(String[] args) {
		ImplementationUsingLL obj = new ImplementationUsingLL();
		obj.push(20);
		obj.push(30);
		System.out.println(obj.peek());
		obj.push(60);
		obj.pop();
		System.out.println(obj.size());
	}

}
