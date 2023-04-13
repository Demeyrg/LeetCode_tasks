package git.example.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***
 *
 * [Level]:         Easy
 *
 * [Link]:          https://leetcode.com/problems/binary-tree-inorder-traversal/
 *
 * [Description]:   Given the root of a binary tree, return the inorder traversal of its nodes' values.
 *
 * [Constraints]:   The number of nodes in the tree is in the range [0, 100].
 *                  -100 <= Node.val <= 100
 *
 ***/


public class BinaryTreeInorderTraversal {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(0, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println(inorderTraversal(treeNode1));
    }


    /**
     *      0 ms, 40.6 MB
     * @param root as {@link TreeNode}
     * @return as List<Integer>
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        addToList(root, list);
        return list;
    }

    public static void addToList(TreeNode node, List<Integer> list) {
        if (node == null)
            return;
        addToList(node.left, list);
        list.add(node.val);
        addToList(node.right, list);
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}