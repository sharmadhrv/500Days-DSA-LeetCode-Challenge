package binarysearchtree.bstiterator173;

import java.util.ArrayList;
import java.util.List;

public class BSTIterator {

    public List<TreeNode> inOrder ;
    int i ;

    public BSTIterator(TreeNode root) {
        inOrder = new ArrayList<>();
        helper(root);
        inOrder.add(root);
        i=0;
    }

    private void helper(TreeNode node)
    {
        if(node == null)
            return;
        helper(node.left);
        inOrder.add(node);
        helper(node.right);
    }

    public int next() {
        return inOrder.get(i++).val;
    }

    public boolean hasNext() {
        return i==inOrder.size();

    }
}
