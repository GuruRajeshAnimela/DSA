class Solution {
    int r;
    int c;
    int perimeter=0;
    int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
    public void bfs(int[][] grid,int i,int j){
       Queue<int[]> queue = new LinkedList<>();
       grid[i][j]=-1;
       queue.offer(new int[]{i,j});
       while(!queue.isEmpty()){
        int[] a = queue.poll();
        for(int[] d : dir){
            int x = a[0]+d[0];
            int y = a[1]+d[1];
            if(x<0||y<0||x>=r||y>=c||grid[x][y]==0){
                perimeter++;
            }
            else if(grid[x][y]==-1){
                continue;
            }else{
                grid[x][y]=-1;
                queue.offer(new int[]{x,y});
                
            }
        }

       }
    }
    public int islandPerimeter(int[][] grid) {
         r = grid.length;
         c = grid[0].length;
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                if(grid[i][j]==1){
                  bfs(grid,i,j);
                  return perimeter;
                }
            }
        }
        return -1;
    } 
}