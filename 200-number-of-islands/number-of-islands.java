class Solution {
    int row;
    int col;
    public void dfs(char grid[][],int i,int j){
        if(i<0||i>=row||j<0||j>=col||grid[i][j]!='1'){
            return;
        }
        grid[i][j] = '$';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
    public int numIslands(char[][] grid) {
         row = grid.length;
         col = grid[0].length;
        int island = 0;
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    island++;
                }
            }
        }
        return island;
    }
}