class Solution {
    int row;
    int col;
    int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
    public int bfs(int[][] grid,int i ,int j){
        Queue<int []> queue = new LinkedList<>();
        queue.offer(new int[]{i,j});
        grid[i][j] =0;
        int count = 0;
        while(!queue.isEmpty()){
            int[] a = queue.remove();
            count ++;
            for(int[] d:dir){
                int x = a[0]+d[0];
                int y = a[1]+d[1];
                if(x>=0&&x<row&&y>=0&&y<col&&grid[x][y]==1){
                    grid[x][y] = 0;
                    queue.offer(new int[]{x,y});
                }
            }
        }
        return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        int island = 0;
        int maxisland = 0;
        
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
              if(grid[i][j]==1){
                island = bfs(grid,i,j);
                maxisland = Math.max(island,maxisland);

              }
            }
        
        }
        return maxisland;
    }
}