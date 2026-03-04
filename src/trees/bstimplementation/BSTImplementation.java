package trees.bstimplementation;

public class BSTImplementation {

    private TreeNode root;

    public int height(TreeNode node)
    {
        if(root == null)
            return 0;
        return node.height;
    }

    public boolean isEMpty()
    { return root == null;}

    public void insert(int value){
        insert(value,root);
    }

    private TreeNode insert(int value, TreeNode node)
    {
        if(node == null)
        {
            node = new TreeNode(value);
            return node;
        }
        if(value<node.data)
            node.left = insert(value, node.left);

        if(value>node.data)
            node.right = insert(value, node.right);

        node.height = Math.max()
    }

}
