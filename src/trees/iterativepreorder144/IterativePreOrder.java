package trees.iterativepreorder144;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePreOrder {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> answer = new ArrayList<>();
        if (root == null) return answer;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            answer.add(temp.val);
            if (temp.right != null)
                stack.push(temp.right);
            if (temp.left != null)
                stack.push(temp.left);
        }
        return answer;
    }
}