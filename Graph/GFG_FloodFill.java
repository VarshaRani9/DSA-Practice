class Solution
{
    private void dfs( int row, int col, int[][]ans, int[][] image, int initClr, int newColor, int deltaRow[], int deltaCol[]){
        ans[row][col] = newColor;
        int n = ans.length;
        int m = ans[0].length;
        for(int i=0;i<4;i++){
            int neighRow = row+deltaRow[i];
            int neighCol = col+deltaCol[i];
            if(neighRow>=0 && neighRow<n && neighCol>=0 && neighCol<m && image[neighRow][neighCol]==initClr && ans[neighRow][neighCol]!=newColor){
                dfs(neighRow, neighCol, ans, image, initClr, newColor, deltaRow, deltaCol);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // Code here
        int initClr = image[sr][sc];
        int ans[][] = image;
        int deltaRow[] = {-1, 0, 1, 0};
        int deltaCol[] = {0, 1, 0, -1};
        dfs(sr, sc, ans, image, initClr, newColor, deltaRow, deltaCol);
        return ans;
    }
}
