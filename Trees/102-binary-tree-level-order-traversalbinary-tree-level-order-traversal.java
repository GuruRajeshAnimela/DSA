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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<TreeNode> TreeNodeQueue = new LinkedList<>();
        TreeNodeQueue.add(root);
        //ArrayList<integer> list = new ArrayList<>();
        while(!TreeNodeQueue.isEmpty()){
            int n = TreeNodeQueue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i<n;i++){
            TreeNode treenode = TreeNodeQueue.poll();
             list.add(treenode.val);
            if(treenode.left!=null){
                TreeNodeQueue.add(treenode.left);
            }
            if(treenode.right!=null){
                TreeNodeQueue.add(treenode.right);
            }

            }

            ans.add(list);

        }
     return ans;   
    }
}
