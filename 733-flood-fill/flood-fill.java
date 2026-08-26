class Solution {
    int rows;
    int cols;
    public void dfs(int[][] image,int row,int col,int curcolor,int newcolor){
        if(row<0||row>=rows||col<0||col>=cols||image[row][col]==newcolor||image[row][col]!=curcolor){
            return;
        }
        image[row][col] = newcolor;
        dfs(image,row,col+1,curcolor,newcolor);
        dfs(image,row,col-1,curcolor,newcolor);
        dfs(image,row+1,col,curcolor,newcolor);
        dfs(image,row-1,col,curcolor,newcolor);
        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        rows = image.length;
        cols = image[0].length;
        int curcolor = image[sr][sc];
        int newcolor = color;
        dfs(image,sr,sc,curcolor,newcolor);
        return image;
    }
}