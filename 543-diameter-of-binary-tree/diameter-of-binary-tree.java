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
    public int diameterOfBinaryTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        HashMap<TreeNode,Integer> map = new HashMap<>();
        int diameter = 0;
        if(root!=null){
            stack.push(root);
        }
        while(!stack.isEmpty()){
            TreeNode node = stack.peek();
            if(node.left!=null&&!map.containsKey(node.left)){
              stack.push(node.left);
            }
            else if(node.right!=null&&!map.containsKey(node.right)){
                stack.push(node.right);
            }else{
                stack.pop();
                int leftdiameter = map.getOrDefault(node.left,0);
                int rightdiameter = map.getOrDefault(node.right,0);
                map.put(node,Math.max(leftdiameter,rightdiameter)+1);

                diameter = Math.max(diameter,leftdiameter+rightdiameter);
            }
        }
        return diameter;
        
    }
}