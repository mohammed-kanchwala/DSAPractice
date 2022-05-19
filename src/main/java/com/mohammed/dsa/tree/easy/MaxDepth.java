package com.mohammed.dsa.tree.easy;

import com.mohammed.dsa.tree.easy.InvertTree.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class MaxDepth {

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static int maxDepthBFS(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int level = 0;
        while (!q.isEmpty()) {
            for (int i = 0; i < q.size(); i++) {
                TreeNode node = q.remove();
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);

            }
            level += 1;
        }
        return level;
//        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static int maxDepthDFSIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        int depth = 0;
        root.depth = 1;
        stack.add(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                depth = Math.max(depth, node.depth);
                if (node.left != null) node.left.depth = depth + 1;
                if (node.right != null) node.right.depth = depth + 1;
                stack.add(node.left);
                stack.add(node.right);
            }
        }

        return depth;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(maxDepth(root));
        System.out.println(maxDepthBFS(root));
        System.out.println(maxDepthDFSIterative(root));
    }
}
