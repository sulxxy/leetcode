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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ret = new ArrayList<Integer>();
        rightview(ret, root, 0);
        return ret;
    }
    
    private void rightview(List<Integer> list, TreeNode root, int currentDepth){
        if(root == null){
            return ;
        }
        if(list.size() == currentDepth){
            list.add(root.val);
        }
        rightview(list, root.right, currentDepth+1);
        rightview(list, root.left, currentDepth+1);
    }
}