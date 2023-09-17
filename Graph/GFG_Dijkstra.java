class Pair{
    int dist;
    int node;
    public Pair(int dist,int node){
        this.dist = dist;
        this.node = node;
    }
}
class Solution
{
    static void minDistance(int dis[], ArrayList<ArrayList<ArrayList<Integer>>> adj, int S){
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y)-> x.dist-y.dist);
        pq.add(new Pair(0,S));
        dis[S] = 0;
        while(pq.size()!=0){
            int distance = pq.peek().dist;
            int nod = pq.peek().node;
            pq.remove();
            for(int i =0;i<adj.get(nod).size();i++){
                int adjWt = adj.get(nod).get(i).get(1);
                int adjNode = adj.get(nod).get(i).get(0);
                if(adjWt+distance < dis[adjNode]){
                    dis[adjNode] = adjWt+distance;
                    pq.add(new Pair(dis[adjNode],adjNode));
                }
            }
        }
    }
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        int dis[] = new int[V];
        for(int i=0;i<V;i++){
            dis[i] = Integer.MAX_VALUE;
        }
        
        minDistance(dis, adj, S);
        return dis;
    }
}
