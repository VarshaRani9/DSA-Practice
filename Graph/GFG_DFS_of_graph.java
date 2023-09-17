class Solution {
    
    public void dfs(int ele, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans){
        vis[ele] = true;
        ans.add(ele);
        for(Integer e : adj.get(ele)){
                if(vis[e]==false){
                    vis[e]=true;
                    dfs(e,vis,adj,ans);
                }
        }
    }
    
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[] = new boolean[V];
        vis[0] = true;
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(0,vis,adj,ans);
        return ans;
    }
    
}
