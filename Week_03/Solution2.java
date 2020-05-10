package week3;

/**
 * 236. 二叉树的最近公共祖先
 */
public class Solution2 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        //1.left和right都为null，返回null
        //2.left和right都不为null，返回root
        //3.left和right有一个为null，可能p和q都在一个子树，也可能只有一个在

        if(left == null && right == null) return null;
        if(left == null) return right;
        if(right == null) return left;
        return root;

    }

}
