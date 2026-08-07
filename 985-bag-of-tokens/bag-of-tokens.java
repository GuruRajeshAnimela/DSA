class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n = tokens.length;
        int score = 0;
        int maxscore = 0;
        Arrays.sort(tokens);
        int i = 0;
        int j = n-1;
        while(i<=j){
           if(power>=tokens[i]){
            power -= tokens[i];
            score++;
            i++;
            maxscore = Math.max(maxscore,score);
           }
           else if(score>=1){
            power += tokens[j];
            score--;
            j--;
           }
           else{
            return maxscore;
           }
        }
        
        return maxscore;
    }
}