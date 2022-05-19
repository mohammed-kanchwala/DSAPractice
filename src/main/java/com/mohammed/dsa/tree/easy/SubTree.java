package com.mohammed.dsa.tree.easy;

import com.mohammed.dsa.tree.easy.InvertTree.TreeNode;

public class SubTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return subRoot == null;
        }
        return isSameTree(root, subRoot) || isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }

    private boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        if (s.val != t.val) return false;
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }
}
