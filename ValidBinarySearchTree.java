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
    public boolean isValidBST(TreeNode root) {
        // if(root == null){
        //     return true;
        // }
        // if(root.left == null && root.right == null){
        //     return true;
        // }
        long max = Integer.MAX_VALUE;
        max++;
        long min = Integer.MIN_VALUE;
        min--;
        return validBSTWithinRange(root, max, min);
    }
    
    public boolean validBSTWithinRange(TreeNode node, long max, long min){
        if(node == null){
            return true;
        }
        if(node.val >= max || node.val <= min){
            return false;
        }
        return validBSTWithinRange(node.left, node.val, min) && validBSTWithinRange(node.right, max, node.val);
    }
}