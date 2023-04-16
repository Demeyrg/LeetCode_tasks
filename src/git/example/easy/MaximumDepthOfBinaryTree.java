package git.example.easy;

/***
 *
 * [Level]:         Easy
 *
 * [Link]:          https://leetcode.com/problems/maximum-depth-of-binary-tree/
 *
 * [Description]:   Given the root of a binary tree, return its maximum depth.
 *                  A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * [Constraints]:   The number of nodes in the tree is in the range [0, 104].
 *                  -100 <= Node.val <= 100
 *
 ***/


public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        TreeNode treeNode2 = new TreeNode(0, null, new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4))));
        TreeNode treeNode3 = new TreeNode(0, new TreeNode(4), new TreeNode(2, new TreeNode(3), null));
        System.out.println(maxDepth(treeNode1));
        System.out.println(maxDepth(treeNode2));
        System.out.println(maxDepth(treeNode3));
    }

    /**
     *      0 ms, 42.3 mb
     * @param root as {@link TreeNode}
     * @return as List<Integer>
     */
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
