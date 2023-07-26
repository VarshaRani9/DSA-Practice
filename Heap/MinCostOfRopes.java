import java.util.PriorityQueue;

public class MinCostOfRopes {

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
	static int minCost(int []arr) {
		PriorityQueue<Integer> minHeap = minHeapCreation(arr);
		int res = 0;
		while(minHeap.size()>1) {
			int first = minHeap.poll();
			int sec = minHeap.poll();
			
			res+=(first+sec);
			
			minHeap.add(first+sec);
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[] = {4,3,2,6};
		System.out.println(minCost(arr));
	}

}
