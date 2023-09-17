class Pair{
    int row;
    int col;
    int time;
    public Pair(int row, int col, int time){
        this.row= row;
        this.col = col;
        this.time = time;
    }
}
class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        // Code here
        Queue<Pair> q= new LinkedList<>();
        int freshCt = 0;
        int m = grid.length;
        int n = grid[0].length;
        int vis[][] = new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if(grid[i][j]==2){
                    vis[i][j]=2;
                    q.add(new Pair(i,j,0));
                }
                else if(grid[i][j]==1){
                    freshCt++;
                }
            }
        }
        int[] deltaRow = {-1,0,1,0};
        int[] deltaCol = {0,-1,0,1};
        int tym = 0;
        int ct =0;
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().time;
            tym = Math.max(tym, t);
            q.remove();
            for(int i =0;i<4;i++){
                int nRow = r+deltaRow[i];
                int nCol = c+deltaCol[i];
                if(nRow>=0 && nRow<m && nCol>=0 && nCol<n && grid[nRow][nCol]==1 && vis[nRow][nCol]!=2){
                    ct++;
                    q.add(new Pair(nRow, nCol, t+1));
                    vis[nRow][nCol] =2;
                }
            }
        }
        if(ct!=freshCt)return -1;
        return tym;
    }
}
