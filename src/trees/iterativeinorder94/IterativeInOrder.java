package trees.iterativeinorder94;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeInOrder {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> inorder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root == null)return inorder;

        TreeNode node = root;
        while(true)
        {
            if(node!=null) {
                stack.push(node);
                node = node.left;
            }
            else{
                if(stack.isEmpty())
                    break;
                else{
                    node = stack.pop();
                    inorder.add(node.val);
                    node =node.right;
                }
            }
        }
        return inorder;
    }
}
