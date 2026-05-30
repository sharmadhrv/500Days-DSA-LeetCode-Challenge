package trees.childrensumproperty;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);

        root.left = new TreeNode(35);
        root.right = new TreeNode(10);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(3);

        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(2);

        ChildrenSumProperty childrenSumProperty = new ChildrenSumProperty();

        childrenSumProperty.childrenSumProperty(root);
        Main main = new Main();
        main.levelOrder(root);
    }

    public void levelOrder(TreeNode root)
    {
        if(root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty())
        {
            TreeNode node = q.poll();

            System.out.print(node.val + " ");

            if(node.left != null)
                q.offer(node.left);

            if(node.right != null)
                q.offer(node.right);
        }
    }
}
