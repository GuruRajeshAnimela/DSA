class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int freshOranges = 0;
        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
        Queue<int []> queue = new LinkedList<>();
        for(int i =0;i<rows;i++){
            for(int j =0;j<cols;j++){
                if(grid[i][j]==1){
                    freshOranges++;
                }
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
            }
        }
        if(freshOranges==0){
            return 0;
        }
        int time = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i =0;i<size;i++){
                int[] a = queue.poll();
                for(int[] d: directions){
                    int x = a[0]+d[0];
                    int y = a[1]+d[1];
                    if(x<0||x>=rows||y<0||y>=cols||grid[x][y]!=1||grid[x][y]==2){
                        continue;
                    }
                    queue.offer(new int[]{x,y});
                    grid[x][y] = 2;
                    freshOranges--;
                    if(freshOranges==0){
                        return time+1;
                    }
                }
            }
            time++;
        }
     return -1;   
    }
}