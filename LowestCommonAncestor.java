class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(!cover(root, p) || !cover(root, q)){
            return null;
        }
        
        return commonAncestorhelper(root, p, q);
    }
    
    public boolean cover(TreeNode root, TreeNode p){
        if(root == null){
            return false;
        }
        if(root == p){
            return true;
        }
        return cover(root.right, p) || cover(root.left, p);
    }
    
    public TreeNode commonAncestorhelper(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return null;
        }
        if(root == q || root == p){
            return root;
        }
        
        boolean is_q_on_left = cover(root.left, q);
        boolean is_p_on_left = cover(root.left, p);
        
        if(is_q_on_left != is_p_on_left){
            return root;
        }
        
        TreeNode childSide = is_q_on_left? root.left : root.right;
        
        return commonAncestorhelper(childSide, p, q);
    }
}