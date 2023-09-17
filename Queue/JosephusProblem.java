import java.util.LinkedList;
import java.util.Queue;

public class JosephusProblem {

	private static int josephus(int n, int k){ 
		Queue<Integer> queue = new LinkedList<>();
		for(int i =1;i<=n;i++) {
			queue.offer(i);
		}
		while(queue.size()>1) {
		for(int i =0;i<k-1;i++) {
			queue.offer(queue.poll());
		}
		queue.poll();
		}
		return queue.peek();		
	}
	public static void main(String[] args) {
		System.out.println(josephus(7,3));
	}

}
