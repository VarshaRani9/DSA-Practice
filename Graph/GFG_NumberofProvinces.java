class Solution {
    public static void dfs(int ele, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[ele]=true;
        for(Integer e: adj.get(ele)){
            if(vis[e] == false){
                dfs(e,vis,adj);
            }
        }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<ArrayList<Integer>>(); 
        for(i nt i = 0;i<V;i++) {
            a djLs.add(new ArrayList<Integer>()); 
        }
        // to change adjacency matrix to list 
        for(int i = 0;i<V;i++) {
            for(int j = 0;j<V;j++) {
                // self nodes are not considered 
                if(adj.get(i).get(j) == 1 && i != j) {
                    adjLs.get(i).add(j); 
                    adjLs.get(j).add(i); 
                }
            }
        }
        boolean vis[] = new boolean[V];
        int count =0;
        for(int i =0;i<V;i++){
            if(vis[i]==false){
                count++;
                dfs(i,vis,adjLs);
            }
        }
        return count;
    }
};
