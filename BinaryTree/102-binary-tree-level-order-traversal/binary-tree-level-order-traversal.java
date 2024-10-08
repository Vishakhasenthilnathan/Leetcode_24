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
            Queue<TreeNode> q = new LinkedList();
        if(root==null) return new ArrayList();
        q.add(root);
        List<List<Integer>> result = new ArrayList();
        while(!q.isEmpty()){
            List<Integer> values = new ArrayList();
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode node = q.remove();
                if(node==null) continue;
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
                values.add(node.val);
            }
            result.add(values);
        }
        return result;    
    }
}