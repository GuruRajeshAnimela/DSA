class Solution {
    public int divisorSubstrings(int num, int k) {
        int tenk =(int) Math.pow(10,k);
        int digits = (int)Math.log10(num)+1;
        int original = num;
        int times = digits-k+1;
        int count = 0;
        while(times>0){
          int rem = num % tenk;
          if(rem!=0&&original%rem==0){
            count++;
          } 
          num = num / 10;
          times--;

        }
      return count;  
    }
}