class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public void combinationSum(int[] candidates, int target,int i,ArrayList<Integer> path){
        if(target<0||i>=candidates.length){
         return;
        }
        if(target==0){
         list.add(new ArrayList<>(path));
         return ;
        }
        path.add(candidates[i]);
        combinationSum(candidates,target-candidates[i],i,path);
        path.remove(path.size()-1);
        combinationSum(candidates,target,i+1,path);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       combinationSum(candidates,target,0,new ArrayList<>());
       return list;

    }
}