import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfArray {

	static int median(int []arr) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++) {
			if(maxHeap.isEmpty() || maxHeap.peek() >= arr[i])
	            maxHeap.add(arr[i]);
	        else
	            minHeap.add(arr[i]);
			if(maxHeap.size()>minHeap.size()+1)
	            minHeap.add(maxHeap.poll());
	        else if(maxHeap.size()<minHeap.size())
	            maxHeap.add(minHeap.poll());
		}
		if(maxHeap.size()==minHeap.size())return (maxHeap.peek()+minHeap.peek())/2;
		else return maxHeap.peek();
	}

	public static void main(String[] args) {
		int arr[] = {1,3,8,9,4};
		System.out.println(median(arr));
	}

}
