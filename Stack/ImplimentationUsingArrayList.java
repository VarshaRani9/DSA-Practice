package stack;

import java.util.ArrayList;

class stack_ArrayList{
	private ArrayList<Integer> list;
	int top;
	public stack_ArrayList() {
		list = new ArrayList<>();
		top = -1;
	}
	
	void push(int ele) {
		list.add(ele);
	}
	int pop(){
		if(list.isEmpty())throw new IllegalStateException("Empty list");
		return list.remove(list.size()-1);
	}
	int peek() {
		if(list.isEmpty())throw new IllegalStateException("Empty list");
		return list.get(list.size()-1);
	}
	int size() {
		return list.size();
	}
	boolean isEmpty() {
		if(list.size()==0)return false;
		return true;
	}
}
public class ImplimentationUsingArrayList {

	public static void main(String[] args) {
		stack_ArrayList obj = new stack_ArrayList();
		obj.push(7);
		System.out.println(obj.peek());
		obj.push(9);
		obj.push(17);
		System.out.println(obj.peek());
		System.out.println(obj.pop());
	}

}
