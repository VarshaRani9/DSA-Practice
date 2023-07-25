import java.util.PriorityQueue;

public class MinDifference_Elements {

	static PriorityQueue<Integer> minHeapCreation(int arr[]) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int i :arr) {
			minHeap.offer(i);
		}
		for(int ele: minHeap) {
			System.out.print(ele+" ");
		}
		System.out.println();
		return minHeap;
	}
	static int minDiff(int arr[]) {
		if(arr.length==0 || arr.length==1)return 0;
		PriorityQueue<Integer> minHeap = minHeapCreation(arr);
		int min = Integer.MAX_VALUE;
		int top = minHeap.poll();
		while(!minHeap.isEmpty()) {
			int cur = minHeap.poll();
			int dif = cur - top;
			min = Math.min(min, dif);
			top = cur;
		}
		return min;
	}
	public static void main(String[] args) {
		int arr[] = {11,32,21,9,24};
		int res = minDiff(arr);
		System.out.println("Min difference : "+res);
	}

}
