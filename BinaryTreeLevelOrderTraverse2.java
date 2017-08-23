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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        levelOrderBottomHelper(list, root, 0);
        return list;
    }
    
    private void levelOrderBottomHelper(List<List<Integer>> list, TreeNode root, int curLev){
        if(root == null){
            return;
        }
        
        //[1,2,3], 0,
        if(curLev >= list.size()){
            List<Integer> curList = new ArrayList<Integer>();
            list.add(0, curList);
        }
        
        levelOrderBottomHelper(list, root.left, curLev+1);
        levelOrderBottomHelper(list, root.right, curLev+1);
        list.get(list.size() - curLev-1).add(root.val);      
    }
}