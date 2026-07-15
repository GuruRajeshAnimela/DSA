class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1)
         return false;
        if(n==1)
         return true;
        
       return isPowerOfTwo(n/2) && n%2==0;
     }
}