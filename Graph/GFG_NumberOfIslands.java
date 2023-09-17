class Pair{
    int first;
    int sec;
    public Pair(int first, int sec){
        this.first = first;
        this.sec = sec;
    }
}

class Solution {
    static void bfs(int i, int j, boolean vis[][], char[][] grid){
        Queue<Pair> q = new LinkedList<>();
        vis[i][j] = true;
        q.add(new Pair(i,j));
        int n = grid.length;
        int m = grid[0].length;
        
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().sec;
            q.remove();
            
            for(int deltaRow = -1;deltaRow<=1;deltaRow++){
                for(int deltaCol =-1;deltaCol<=1;deltaCol++){
                    int neighRow = deltaRow + row;
                    int neighCol = deltaCol + col;
                    if(neighRow>-1 && neighRow<n && neighCol>-1 && neighCol<m && grid[neighRow][neighCol]=='1' && (vis[neighRow][neighCol]==false)){
                        vis[neighRow][neighCol]=true;
                        q.add(new Pair(neighRow,neighCol));
                    }
                }
            }
        }
    }
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        boolean vis[][] = new boolean[n][m];
        int ct = 0;
        
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==false && grid[i][j]=='1'){
                    ct++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return ct;
    }
}
