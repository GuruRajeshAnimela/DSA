class Solution {
    public int maximumLengthSubstring(String s) {
       int left = 0;
       int right = 0;
       int count[] = new int[26];
       int windowsize = 0;
       int n = s.length();
       while(right<n){
        int index = s.charAt(right)-'a';
        if(count[index]<2){
            count[index]++;
            windowsize = Math.max(windowsize,right-left+1);
            right++;
        }
        else{
            int leftindex = s.charAt(left)-'a';
            count[leftindex]--;
            left++;
        }
       } 
       return windowsize;
    }
}