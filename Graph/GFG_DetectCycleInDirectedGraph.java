class Solution {
    static boolean dfsCheck(int node, int vis[], int pathVis[], ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;
        pathVis[node] = 1;
        for(Integer e : adj.get(node)){
            if(vis[e] == 0){
                if(dfsCheck(e,vis,pathVis,adj)==true)return true;
            }
            else if(pathVis[e]==1)return true;
        }
        pathVis[node]=0;
        return false;
    }
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int vis[] = new int[V];
        int pathVis[] = new int[V];
        for(int i =0;i<V;i++){
            if(dfsCheck(i,vis,pathVis,adj)==true)return true;
        }
        return false;
    }
}
