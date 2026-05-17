package trees.iterativepreorder144;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);


        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        IterativePreOrder obj = new IterativePreOrder();

        List<List<Integer>> result = obj.preorderTraversal(root);

        System.out.println(result);

    }
}
