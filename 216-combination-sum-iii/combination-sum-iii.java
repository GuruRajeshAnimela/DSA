class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public void combinationSum3(int k, int n,int[] a,int index,ArrayList<Integer> path){

         
        if(n==0&&path.size()==k){
            list.add(new ArrayList<>(path));
            return ;
        }
         if(n<0||path.size()>k||index==a.length){
            return;
        }
        // if(!path.contains(a[index]))
           path.add(a[index]);
        combinationSum3(k,n-a[index],a,index+1,path);
        path.remove(path.size()-1);
        combinationSum3(k,n,a,index+1,path);


    }
    public List<List<Integer>> combinationSum3(int k, int n) {
    //   if(k>n||n>9)
    //    return list;
       int[] a = {1,2,3,4,5,6,7,8,9};
       
      combinationSum3(k,n,a,0,new ArrayList<>());
      return list;   
    }
}