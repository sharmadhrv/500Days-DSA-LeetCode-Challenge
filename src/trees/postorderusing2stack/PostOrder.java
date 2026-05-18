package trees.postorderusing2stack;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrder {

    public List<Integer> postOrder(TreeNode root)
    {
        List<Integer> postOrder = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        if(root == null) return postOrder;

        stack1.push(root);
        while(!stack1.isEmpty())
        {
            TreeNode node = stack1.pop();
            if(node.left!=null)
                stack1.push(node.left);
            if(node.right!=null)
                stack1.push(node.right);
            stack2.push(node);
        }
        while(!stack2.isEmpty())
        {
            postOrder.add(stack2.pop().val);
        }
        return postOrder;
    }
}
