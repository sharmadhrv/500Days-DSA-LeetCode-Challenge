package binarysearchtree.maximumsumBSTinbinarytree1373;

import java.util.ArrayList;
import java.util.List;

public class MaximumSum {
    public int maxSumBST(TreeNode root) {

        List<TreeNode > inOrder = new ArrayList<>();
        inOrder(root,inOrder);
        TreeNode req=null;
        for(TreeNode node : inOrder)
        {
            if(!isValid(node,Integer.MAX_VALUE,Integer.MIN_VALUE))
            {
                req = node;
                break;
            }
        }
        int[] sum = new int[1];
        treeSum(req,sum);
        return sum[0];

    }
    private void inOrder(TreeNode node, List<TreeNode> inOrder)
    {
        if(node== null ) return;
        inOrder(node.left,inOrder);
        inOrder.add(node);
        inOrder(node.right,inOrder);
    }

    private boolean isValid(TreeNode node, int max , int min)
    {
        if(node == null) return true;
        if(node.val<=min || node.val >=max) return false;
        return isValid(node.left,node.val,min)
        && isValid(node.right,max,node.val);
    }

    private void treeSum(TreeNode node, int[] sum)
    {
        if(node == null) return;
        treeSum(node.left,sum);
        sum[0] = sum[0]+node.val;
        treeSum(node.right,sum);
    }

}
