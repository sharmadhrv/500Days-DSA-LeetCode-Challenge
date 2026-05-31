package trees.leverordertraversal102;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);

        root.right = new TreeNode(20);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(7);

        LevelOrder obj = new LevelOrder();

        List<List<Integer>> result = obj.levelOrder(root);

        System.out.println(result);
    }
}
