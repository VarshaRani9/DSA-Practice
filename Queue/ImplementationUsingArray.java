class Implementation{
	int arr[];
	int capacity;
	int f;
	int r;
	public Implementation(int capacity){
		this.capacity = capacity;
		f = 0;
		r = -1;
		arr = new int[capacity];
	}
	
	void enque(int ele) {
		if(r==capacity) {
			System.out.println("Overflow!!");
			return;
		}
		arr[++r] = ele;
	}
	void deque() {
		if(f>r) {
			System.out.println("Underflow!!");
			return;
		}
		arr[f] = -1;
		f++;	
	}
	void print() {
		for(int i = f;i<=r;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	int frontEle() {
		return f;
	}
	int rearEle() {
		return r;
	}
	boolean isEmpty() {
		return f>r;
	}
	int size() {
		return r-f+1;
	}
}

public class ImplementationUsingArray {

	public static void main(String[] args) {
		Implementation q = new Implementation(7);
		q.enque(10);
		q.print();
		System.out.println("Front : "+q.frontEle());
		System.out.println("Rear : "+q.rearEle());
		q.enque(20);
		q.enque(30);
		q.enque(40);
		q.enque(50);
		q.print();
		System.out.println("Front : "+q.frontEle());
		System.out.println("rear : "+q.rearEle());
		q.deque();
		q.print();
		System.out.println("Empty ? "+q.isEmpty());
		System.out.println("size "+q.size());
	}

}
