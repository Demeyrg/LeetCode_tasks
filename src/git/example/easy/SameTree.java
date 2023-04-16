package git.example.easy;

/***
 *
 * [Level]:         Easy
 *
 * [Link]:          https://leetcode.com/problems/same-tree/
 *
 * [Description]:   Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 *                  Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 *
 * [Constraints]:   The number of nodes in both trees is in the range [0, 100].
 *                  -104 <= Node.val <= 104
 *
 ***/


public class SameTree {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        TreeNode treeNode2 = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        TreeNode treeNode3 = new TreeNode(0, new TreeNode(4), new TreeNode(2, new TreeNode(3), null));
        System.out.println(isSameTree(treeNode1, treeNode2));
        System.out.println(isSameTree(treeNode1, treeNode3));
    }


    /**
     *      0 ms, 40 mb
     * @param p as {@link TreeNode}
     * @param q as {@link TreeNode}
     * @return as List<Integer>
     */
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
