package binarysearchtree.inordersuccessor;


public class InOrderSuccessor {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode key)
    {
        TreeNode[] successor = new TreeNode[1];
         helper(root,key,successor);
         return successor[0];
    }

    private void helper(TreeNode node,TreeNode key,TreeNode[] successor)
    {
        if(node == null)
            return;
        if(node.val <= key.val)
            helper(node.right,key,successor);
        else {
            successor[0] = node;
            helper(node.left,key,successor);
        }
    }
}
