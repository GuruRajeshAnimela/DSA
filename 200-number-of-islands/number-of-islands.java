class Solution {
    int row;
    int col;
    int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
    public void bfs(char[][] grid,int i,int j){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i,j});
        grid[i][j] = '$';
        while(!queue.isEmpty()){
            int[] a = queue.remove();
            //grid[a[0],a[1]] = '$';
            for(int[] d : dir){
                int x = d[0]+a[0];
                int y = d[1]+a[1];
                if(x<0||x>=row||y<0||y>=col||grid[x][y]!='1')
                 continue ;
                else{
                    grid[x][y] = '$';
                    queue.offer(new int[]{x,y});
                }
            }
        }

    }
    public int numIslands(char[][] grid) {
         row = grid.length;
         col = grid[0].length;
        int island = 0;
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                if(grid[i][j]=='1'){
                    bfs(grid,i,j);
                    island++;
                }
            }
        }
        return island;
    }
}