/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root!=null){
            queue.add(root);
        }
        double l =0;
        while(!queue.isEmpty()){
            int c = queue.size();
            int temp = c;
            double levelsum = 0;
            while(temp>0){
                 TreeNode n = queue.poll();
                 levelsum += n.val;
                if(n.left!=null){  
                 queue.add(n.left);
                }
                if(n.right!=null){
                 queue.add(n.right);
                 
                }
                temp--;
            }
           
            ans.add(levelsum/c);

        }
        return ans;
        
    }
}