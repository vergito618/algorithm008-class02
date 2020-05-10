package week3;

import java.util.HashMap;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 */
public class Solution3 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return buildTreeRecursive(preorder, 0, preorder.length, inorder, 0, inorder.length, map);
    }

    private TreeNode buildTreeRecursive(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd, HashMap<Integer, Integer> map) {
        if (pStart >= pEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[pStart]);
        int inorderRootIndex = map.get(preorder[pStart]);
        int leftNum = inorderRootIndex-iStart;
        root.left = buildTreeRecursive(preorder, pStart+1, pStart+1+leftNum, inorder, iStart, inorderRootIndex, map);
        root.right = buildTreeRecursive(preorder, pStart+1+leftNum, pEnd, inorder, inorderRootIndex+1, iEnd, map);
        return root;
    }

}
