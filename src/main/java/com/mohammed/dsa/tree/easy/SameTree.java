package com.mohammed.dsa.tree.easy;

import com.mohammed.dsa.tree.easy.InvertTree.TreeNode;

public class SameTree {

    static Boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if ((p == null || q == null) || (p.val != q.val)) return false;

        return isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right);
    }
}
