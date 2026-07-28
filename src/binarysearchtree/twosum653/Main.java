package binarysearchtree.twosum653;

public class Main {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.right = new TreeNode(7);

        TwoSum twoSum = new TwoSum();
        System.out.println(twoSum.findTarget(root, 9));
    }
}
