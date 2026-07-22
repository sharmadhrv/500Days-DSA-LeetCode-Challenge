package binarysearchtree.lowestcommonancestor235;

public class Main {
    public static void main(String[] args) {

        // Construct the BST
        TreeNode root = new TreeNode(6);

        root.left = new TreeNode(2);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);

        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        TreeNode p = root.left;        // Node 2
        TreeNode q = root.right;       // Node 8

       LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();

        TreeNode ans = lowestCommonAncestor.lowestCommonAncestor(root, p, q);

        System.out.println("Lowest Common Ancestor = " + ans.val);
    }
}
