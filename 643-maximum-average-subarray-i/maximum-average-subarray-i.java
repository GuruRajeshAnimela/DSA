class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxavg;
        int sum = 0;
        for(int i = 0;i<k;i++){
          sum += nums[i];
        }
        maxavg = (double) sum/k;
        
        int end = k;
        for(int i = 1;i<nums.length-k+1;i++){
         sum = sum-nums[i-1]+nums[end];
         maxavg = Math.max(maxavg,(double)sum/k);
         end++;
        }
        return maxavg;
    }
}