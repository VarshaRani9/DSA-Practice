import java.util.PriorityQueue;

public class SmallestMultipleOfKNums {

	static int minMul(int arr[], int k){
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int ele:arr) {
			minHeap.add(ele);
		}
		int ans = 1;
		while(k>0) {
			if(minHeap.isEmpty())return -1;
			else
			ans*= minHeap.poll();
			k--;
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[] = {7,9,4,3,6};
		int k =3;
		System.out.println(minMul(arr,k));
	}
}
