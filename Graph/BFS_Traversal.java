import java.util.ArrayList;
import java.util.LinkedList;

public class BFS_Traversal {
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	static void bfs(ArrayList<ArrayList<Integer>> adj, int V) {
		boolean visited[] = new boolean[V+1];
		for(int i =0;i<V+1;i++) {
			visited[i] = false;
		}
		int source = 1;
		visited[source] = true;
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(source);
		while(queue.size()!=0) {
			// pop and retrieve first element of queue
			source = queue.poll();
			System.out.print(source+", ");
			// get adjacent vertex of source
			int size = adj.get(source).size();
			for(int i =0;i<size;i++) {
				int adjNode = adj.get(source).get(i);
				if(visited[adjNode]==false) {
					visited[adjNode]=true;
					queue.add(adjNode);
				}
			}
		}
	}
	public static void main(String[] args) {
		int V = 4;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i =0;i<V+1;i++) {
			adj.add(new ArrayList<>());
		}
		addEdge(adj,0,1);
		addEdge(adj,2,1);
		addEdge(adj,0,4);
		addEdge(adj,2,3);
		bfs(adj,V);
	}
}
