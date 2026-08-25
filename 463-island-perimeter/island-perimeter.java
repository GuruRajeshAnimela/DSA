class Solution {
    int r;
    int c;
    int perimeter=0;
    public void dfs(int[][] grid,int i,int j){
        if(i<0||j<0||i>=r||j>=c||grid[i][j]==0){
            perimeter++;
            return;
        }
        if(grid[i][j]==-1){
            return;
        }
        grid[i][j]=-1;
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
    }
    public int islandPerimeter(int[][] grid) {
         r = grid.length;
         c = grid[0].length;
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                if(grid[i][j]==1){
                  dfs(grid,i,j);
                  return perimeter;
                }
            }
        }
        return -1;
    } 
}