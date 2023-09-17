class Solution
{
    static boolean bfsCheck(int start, int clr[], ArrayList<ArrayList<Integer>>adj){
        clr[start] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            
            for(Integer e : adj.get(node)){
                if(clr[e]==-1){
                    clr[e]=1-clr[node];
                    q.add(e);
                }
                else if(clr[e]==clr[node])return false;
            }
        }
        return true;
        
    }
    static boolean dfsCheck(int start, int color, int clr[], ArrayList<ArrayList<Integer>>adj){
        clr[start] = color;
        for(Integer e: adj.get(start)){
            if(clr[e]==-1){
                if(dfsCheck(e,1-color,clr,adj)==false)return false;
            }
            else if(clr[e]==color)return false;
        }
        return true;
        
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int clr[] = new int[V];
        for(int i =0;i<V;i++){
            clr[i]=-1;
        }
        for(int i =0;i<V;i++){
            if(clr[i]==-1){
                // if(bfsCheck(i,clr,adj)==false)return false;
                if(dfsCheck(i,0,clr,adj)==false)return false;
            }
        }
        return true;
    }
}
