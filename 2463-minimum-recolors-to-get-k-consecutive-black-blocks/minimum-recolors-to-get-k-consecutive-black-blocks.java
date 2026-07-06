class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whites = 0;
        int minwhites = 0;
        for(int i =0;i<k;i++ ){
            if(blocks.charAt(i)=='W')
              whites++;
        }
        minwhites = whites;
        int end = k;
        for(int i = 1;i<=blocks.length()-k;i++){
            if(blocks.charAt(i-1)=='W')
               whites--;
            if(blocks.charAt(end)=='W')
               whites++;
           minwhites = Math.min(minwhites,whites);
         end++;
        }
       return minwhites; 
    }
}