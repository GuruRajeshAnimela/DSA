class Solution {
    int row;
    int col;
    
    public int dfs(int[][] grid,int i,int j){
      if(i<0||i>=row||j<0||j>=col||grid[i][j]==0){
        return 0;
      }
      grid[i][j] = 0;
      return 1+
      dfs(grid,i+1,j)+dfs(grid,i-1,j)+dfs(grid,i,j+1)+dfs(grid,i,j-1);
      

    }
    public int maxAreaOfIsland(int[][] grid) {
         row = grid.length;
         col = grid[0].length;
        int size = 0;
        int maxisland = 0;
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                if(grid[i][j]==1){
                   size = dfs(grid,i,j);
                   maxisland= Math.max(maxisland,size);
                }
            }
        }
        return maxisland;
        
    }
}