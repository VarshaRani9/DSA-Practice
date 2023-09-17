class Pair{
    int node;
    int parent;
    public Pair(int node,int parent){
        this.node = node;
        this.parent = parent;
    }
}
class Solution {
    // BFS
    static boolean bfsCheckCycle(int src, boolean []vis, ArrayList<ArrayList<Integer>> adj){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src,-1));
        vis[src] = true;
        
        while(!q.isEmpty()){
            int nod = q.peek().node;
            int par = q.peek().parent;
            q.remove();
            
            for(Integer adjNode : adj.get(nod)){
                if(vis[adjNode]==false){
                    vis[adjNode]=true;
                    q.add(new Pair(adjNode,nod));
                }
                else if(adjNode!=par)return true;
            }
        }
        return false;
    }
    // DFS
    static boolean dfsCheckCycle(int src, int parent, boolean []vis, ArrayList<ArrayList<Integer>> adj){
        vis[src] = true;
            
            for(Integer adjNode : adj.get(src)){
                if(vis[adjNode]==false){
                    vis[adjNode]=true;
                    if(dfsCheckCycle(adjNode, src, vis,adj))return true;
                }
                else if(adjNode!=parent)return true;
            }
        return false;
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[] = new boolean[V];
        for(int i =0;i<V;i++){
            vis[i]=false;
        }
        for(int i =0;i<V;i++){
            if(vis[i]==false){
                // if(bfsCheckCycle(i,vis,adj))return true;
                if(dfsCheckCycle(i, -1, vis,adj))return true;
            }
        }
        return false;
    }
}
