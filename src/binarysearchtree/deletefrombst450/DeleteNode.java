package binarysearchtree.deletefrombst450;

public class DeleteNode {
    public TreeNode deleteNode(TreeNode root, int key) {

        TreeNode dummy = root;
        if(root == null) return root;
        if(root.val == key)
            helper(root);
        while(root!=null) {
            if (key < root.val) {
                if (root.left != null && root.left.val == key) {
                    root.left = helper(root.left);
                    break;
                }
                root = root.left;
            } else {
                if (root.right != null && root.right.val == key) {
                    root.right = helper(root.right);
                    break;
                }
                root = root.right;
            }
        }
            return dummy;
    }

    private TreeNode helper(TreeNode node) {
        if (node.left == null) return node.right;
        else if (node.right == null) return node.left;
        else {
            TreeNode rightChild = node.right;
            TreeNode lastChild = findLastChild(node.left);
            lastChild.right = node.right;
            return node.left;
        }
    }

    private TreeNode findLastChild(TreeNode node)
    {
        if(node.right==null) return  node;
        return findLastChild(node.right);
    }
}
