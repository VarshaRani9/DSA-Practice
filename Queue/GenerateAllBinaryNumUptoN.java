
import java.util.LinkedList;
import java.util.Queue;

public class GenerateAllBinaryNumUptoN {

	private static void gen(int n) {
		Queue<String> q = new LinkedList<>();
		q.offer("1");
		for(int i =0;i<n;i++) {
			String cur = q.poll();
			System.out.print(cur+" ");
			String e1 = cur+"0";
			String e2 = cur+"1";
			q.offer(e1);
			q.offer(e2);
		}
	}
	public static void main(String[] args) {
		gen(10);
	}

}
