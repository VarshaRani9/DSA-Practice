class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];
        vis[0]=true;
        q.add(0);
        
        while(!q.isEmpty()){
            int ele = q.poll();
            res.add(ele);
            for(Integer e : adj.get(ele)){
                if(vis[e]==false){
                    vis[e]=true;
                    q.add(e);
                }
            }
        }
        
        return res;
    }
}
