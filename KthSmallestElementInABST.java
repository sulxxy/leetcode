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
    public int kthSmallest(TreeNode root, int k) {
        int leftCount = countNodeNum(root.left);
        if(k <= leftCount){
            return kthSmallest(root.left, k);
        }else if(k > leftCount + 1){
            return kthSmallest(root.right, k - leftCount - 1);
        }
        
        return root.val;
    }
    
    private int countNodeNum(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + countNodeNum(root.left) + countNodeNum(root.right);
    }
}