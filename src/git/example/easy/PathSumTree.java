package git.example.easy;

/***
 *
 * [Level]:         Easy
 *
 * [Link]:          https://leetcode.com/problems/path-sum/
 *
 * [Description]:   Given the root of a binary tree and an integer targetSum, return true
 *                  if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.     A leaf is a node with no children.
 *
 * [Constraints]:   The number of nodes in the tree is in the range [0, 5000].
 *                  -1000 <= Node.val <= 1000
 *                  -1000 <= targetSum <= 1000
 *
 ***/


public class PathSumTree {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(4, null, new TreeNode(10, new TreeNode(6), null));
        TreeNode treeNode2 = new TreeNode(4, null, new TreeNode(5, new TreeNode(9), null));
        TreeNode treeNode3 = new TreeNode(1, new TreeNode(8), new TreeNode(5, new TreeNode(9), null));
        System.out.println(hasPathSum(treeNode1, 20));
        System.out.println(hasPathSum(treeNode2, 15));
        System.out.println(hasPathSum(treeNode3, 9));
    }

    /**
     *      0 ms, 42.4 mb
     * @param root as {@link TreeNode}
     * @param targetSum as int
     * @return as List<Integer>
     */
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        int minus = targetSum - root.val;
        if (root.right == null && root.left == null && minus == 0)
            return true;
        return hasPathSum(root.left, minus) || hasPathSum(root.right, minus);
    }
}
