class Solution {
    int rows;
    int cols;
    int dir[][] = {{1,0},{-1,0},{0,1},{0,-1}};
    public void bfs(int[][] image,int row,int col,int curcolor,int newcolor){
        Queue<int []> queue = new LinkedList<>();
        queue.offer(new int[]{row,col});
        image[row][col] = newcolor;
        while(!queue.isEmpty()){
            int[] a = queue.remove();
            for(int[] d:dir){
                int x = a[0]+d[0];
                int y = a[1]+d[1];
                if(x<0||x>=rows||y<0||y>=cols||image[x][y]==newcolor||image[x][y]!=curcolor){
                    continue;
                }else{
                    queue.offer(new int[]{x,y});
                    image[x][y]= newcolor;
                }
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        rows = image.length;
        cols = image[0].length;
        int curcolor = image[sr][sc];
        int newcolor = color;
        bfs(image,sr,sc,curcolor,newcolor);
       return image;
    }
}