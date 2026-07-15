class Solution {
    public int numberOfSteps(int num) {
        if(num == 0)
          return 0;
        int count = 0;
        if(num%2==0){
          count = numberOfSteps(num/2);
        }
        else{
            count = numberOfSteps(num-1);
        }
        int sol = count+1;
       return sol;
    }
}