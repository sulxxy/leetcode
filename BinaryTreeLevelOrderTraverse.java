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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> curLevelNodeQueue = new LinkedList<TreeNode>(); 
        if(root == null){
            return list;
        }
        curLevelNodeQueue.add(root);
        
        TreeNode curNode = null;
        while(!curLevelNodeQueue.isEmpty()){
            int curLevelNodeNum = curLevelNodeQueue.size();
            List<Integer> curLevelList = new ArrayList<Integer>();
            for(int i = 0; i < curLevelNodeNum; i++){
                curNode = curLevelNodeQueue.remove();
                curLevelList.add(curNode.val);
                if(curNode.left != null){
                    curLevelNodeQueue.add(curNode.left);
                }
                if(curNode.right != null){
                    curLevelNodeQueue.add(curNode.right);
                }
            }
            list.add(curLevelList);
        }
        return list;
        
    }
}