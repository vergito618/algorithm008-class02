package April;

import java.util.List;

public class EveryDay25 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 面试题 01.08. 零矩阵
     * https://leetcode-cn.com/problems/zero-matrix-lcci/
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {
        //遍历一遍得到所有需要清零的行和列
        boolean[] line = new boolean[matrix.length];
        boolean[] row = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                if (matrix[i][j] == 0) {
                    line[i] = true;
                    row[j] = true;
                }
            }
        }
        //对应的行置为0
        for (int i = 0; i < matrix.length; ++i) {
            if (line[i]) {
                for (int j = 0; j < matrix[0].length; ++j) {
                    matrix[i][j] = 0;
                }
            }
        }
        //对应的列置为0
        for (int i = 0; i < matrix[0].length; ++i) {
            if (row[i]) {
                for (int j = 0; j < matrix.length; ++j) {
                    matrix[j][i] = 0;
                }
            }
        }
    }

    /**
     * 1200. 最小绝对差
     * @param arr
     * @return
     */
//    public List<List<Integer>> minimumAbsDifference(int[] arr) {
//
//    }


    /**
     * 543. 二叉树的直径
     * @param root
     * @return
     */
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        return Math.max(left, right) + 1;
    }

}
