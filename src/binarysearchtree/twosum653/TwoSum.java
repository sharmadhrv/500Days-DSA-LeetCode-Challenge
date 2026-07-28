package binarysearchtree.twosum653;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class TwoSum {

    public boolean findTarget(TreeNode root, int k) {

        List<TreeNode> inorder = new ArrayList<>();
        inOrder(root,inorder);
        boolean answer = false;

        int left = 0;
        int right = inorder.size()-1;
        while(left < right)
        {
            int val = inorder.get(left).val + inorder.get(right).val;
            if(val == k)
            return true;
            else if(val<k)
            left++;
            else right--;
        }
        return answer;
    }

    private void inOrder(TreeNode node, List<TreeNode>inorder)
    {
        if(node == null)
            return;
        inOrder(node.left,inorder);
        inorder.add(node);
        inOrder(node.right,inorder);
    }
}
