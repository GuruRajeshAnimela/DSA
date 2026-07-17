class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public void combinationSum2(int[] candidates, int target,int index,ArrayList<Integer> path){
        
        if(target==0){
         list.add(new ArrayList<>(path));
         return ;
        }
        if(index==candidates.length||target<0)
         return;
        path.add(candidates[index]);
        combinationSum2(candidates,target-candidates[index],index+1,path);
        path.remove(path.size()-1);
       
        while(index+1<candidates.length&&candidates[index]==candidates[index+1])
         index++;

        combinationSum2(candidates,target,index+1,path);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        combinationSum2(candidates,target,0,new ArrayList<>());
        return list;
    }
}