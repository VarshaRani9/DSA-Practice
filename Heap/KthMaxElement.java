public class KthMaxElement {
	private int[] heap;
	private int size;
	private int capacity;
	public KthMaxElement(int capacity) {
		this.capacity = capacity;
		size = 0;
		heap = new int[capacity];
	}
	int parent(int index) {
		return (index-1)/2;
	}
	int leftChild(int index) {
		return 2*index+1;
	}
	int rightChild(int index) {
		return 2*index+2;
	}
	void swap(int index1, int index2) {
		int temp = heap[index1];
		heap[index1] = heap[index2];
		heap[index2] = temp;
	}
	void insert(int val) {
		if(size==capacity) {
			System.out.println("Heap full!!");
			return;
		}
		int cur = size;
		heap[size++] = val;
		while(cur>0 && heap[cur]>heap[parent(cur)]) {
			swap(cur,parent(cur));
			cur = parent(cur);
		}
	}
	void maxHeapify(int index) {
		int par = index;
		int lc = leftChild(index);
		int rc = rightChild(index);
		if(lc<size && heap[lc]>heap[par]) {
			par = lc;
		}
		if(rc<size && heap[rc]>heap[par]) {
			par = rc;
		}
		if(par!=index) {
			swap(index,par);
			maxHeapify(par);
		}
		
	}
	int delete() {
		if(size==0) {
			System.out.println("Empty heap!!");
			return -1;
		}
		int del = heap[0];
		heap[0] = heap[--size];
		maxHeapify(0);
		return del;
	}
	public static void main(String[] args) {
		MaxHeap heap = new MaxHeap(10);
		int k = 2;
		heap.insert(10);
		heap.insert(20);
		heap.insert(30);
		heap.insert(40);
		heap.insert(50);
		for(int i =0;i<k-1;i++) {
			heap.delete();
		}
		System.out.println(heap.delete());
	}
}
