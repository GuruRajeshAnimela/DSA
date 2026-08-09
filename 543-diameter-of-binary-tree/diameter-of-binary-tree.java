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
    int maxdiameter =0;
    public int diameterOfBinaryTree(TreeNode root) {
        Calculatediameter(root);
        return maxdiameter;
        
    }
    public int Calculatediameter(TreeNode node){
        if(node==null)
         return 0;


        int left = Calculatediameter(node.left);
        int right = Calculatediameter(node.right);
         maxdiameter = Math.max(maxdiameter,left+right);
        return Math.max(left,right)+1;
    }
}