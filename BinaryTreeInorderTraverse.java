/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * For example:
 * Given binary tree [1,null,2,3]
 *return  return [1,3,2].out
 *
 * difficulty: medium
 **/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private List<Integer> ls = new LinkedList<Integer>();
    
    
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return ls;
        }
        inorderTraversal(root.left);
        ls.add(root.val);
        inorderTraversal(root.right);
        return ls;
    }
    
}
