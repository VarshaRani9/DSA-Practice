import java.util.Collections;
import java.util.PriorityQueue;

public class LargestMultipleOfKNums {

	static int maxMul(int arr[], int k){
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		for(int ele:arr) {
			maxHeap.add(ele);
		}
		int ans = 1;
		while(k>0) {
			if(maxHeap.isEmpty())return -1;
			else
			ans*= maxHeap.poll();
			k--;
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[] = {7,9,4,3,6};
		int k =3;
		System.out.println(maxMul(arr,k));
	}

}
