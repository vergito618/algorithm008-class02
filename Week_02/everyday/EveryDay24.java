package April;

import org.omg.CORBA.NO_IMPLEMENT;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class EveryDay24 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };



    /**
     * 104. 二叉树的最大深度
     */
    public int maxDepth(TreeNode root) {
        //递归DFS -- 深度优先
//        if (root == null) {
//            return 0;
//        }
//        int leftHight = maxDepth(root.left);
//        int rightHight = maxDepth(root.right);
//        return Math.max(leftHight, rightHight) + 1;
        //遍历BFS -- 广度优先
        if (root == null) {
            return 0;
        }
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            depth++;
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

        }
        return depth;
    }

    /**
     * 111. 二叉树的最小深度
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
//        if (root.left == null && root.right == null) {
//            return 1;
//        }
//        int leftDepth = minDepth(root.left);
//        int rightDepth = minDepth(root.right);
//        if(root.left == null || root.right == null) return leftDepth + rightDepth + 1;
//        return Math.min(leftDepth, rightDepth) + 1;
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            depth++;
            int size = queue.size();
            for (int i = 0; i <size; ++i) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) {
                    return depth;
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return depth;
    }

    /**
     * 559. N叉树的最大深度
     */
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
//        int maxDepth = 0;
//        for (Node node : root.children) {
//            maxDepth = Math.max(maxDepth, maxDepth(node));
//        }
//        return maxDepth+1;
        Queue<Node> queue = new LinkedList<>();
        int maxDepth = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            maxDepth++;
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                Node node = queue.poll();
                for (Node child : node.children) {
                    if (child != null) {
                        queue.add(child);
                    }
                }
            }
        }
        return maxDepth;
    }

    /**
     * 110. 平衡二叉树
     * @param root
     * @return
     */
//    public boolean isBalanced(TreeNode root) {
//
//    }
}
