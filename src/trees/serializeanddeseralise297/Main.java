package trees.serializeanddeseralise297;

public class Main {

    public static void main(String[] args) {
  /*
                    1
                  /   \
                 2     3
                / \   / \
               4   5 6   7
                  / \
                 8   9

        Boundary Traversal:
        1 2 4 8 9 6 7 3
        */
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        root.left.right.left = new TreeNode(8);
        root.left.right.right = new TreeNode(9);

        SerializeDeserialize serializeDeserialize = new SerializeDeserialize();
        System.out.println(serializeDeserialize.serialize(root));
    }
}
