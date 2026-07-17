class Solution {
    List<List<Integer>> list =new ArrayList<>();
    public void subsets(int[] nums,int index,ArrayList<Integer> set){
      if(index==nums.length){
       list.add(new ArrayList<>(set));
       return;
      }
      if(index>nums.length)
       return ;
    set.add(nums[index]);
    subsets(nums,index+1,set);
    set.remove(set.size()-1);
    subsets(nums,index+1,set);
  }
    public List<List<Integer>> subsets(int[] nums) {
        
        
        subsets(nums,0,new ArrayList<>());  
        return list;
    }
}