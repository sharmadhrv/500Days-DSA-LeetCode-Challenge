package binarysearchtree.insertnode701;

public class InsertNode {
    public TreeNode insertIntoBST(TreeNode root, int val) {

             TreeNode node = new TreeNode(val);
             TreeNode dummy = root;
             if(root == null) return node;
             while(dummy !=null)
             {
                 if(val<dummy.val)
                 {
                     if(dummy.left==null) {
                         dummy.left = node;
                         return root;
                     }
                     dummy = dummy.left;
                 }
                 else {
                     if (dummy.right == null) {
                         dummy.right = node;
                         return root;
                     }
                     dummy = dummy.right;
                 }
             }
             return root;
        }
}
