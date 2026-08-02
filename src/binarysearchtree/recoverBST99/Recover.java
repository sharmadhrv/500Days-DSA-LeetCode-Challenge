package binarysearchtree.recoverBST99;

import java.lang.reflect.Array;
import java.util.*;

public class Recover {

    // bruteforce
    public void recoverTree(TreeNode root) {
        List<Integer> inOrder = new ArrayList<>();
        inOrder(root,inOrder);
        Collections.sort(inOrder);
        inOrder2(root,inOrder,new int[] {0});
    }

    private void inOrder(TreeNode node, List<Integer> inOrder)
    {
        if(node == null) return;
        inOrder(node.left,inOrder);
        inOrder.add(node.val);
        inOrder(node.right,inOrder);
    }

    private void inOrder2(TreeNode node, List<Integer> inOrder,int[] i)
    {
        if(node == null) return;
        inOrder2(node.left,inOrder,i);
        if(inOrder.get(i[0])!=node.val)
            node.val=inOrder.get(i[0]);
        i[0]++;
        inOrder2(node.right,inOrder,i);
    }
    // better approach

    public void recoverTree2(TreeNode root) {
        List<TreeNode> inOrder = new ArrayList<>();
        inOrder3(root,inOrder);
        TreeNode one=null,two=null;
        for(int i=1;i<inOrder.size();i++)
        {
            TreeNode prev = inOrder.get(i-1);
            TreeNode cur = inOrder.get(i);
            if(prev.val>cur.val)
            {
                 if(one == null)
                 {
                     one =prev;
                     two = cur;
                 }
                 else two = cur;

            }
        }

        int temp = one.val;
        one.val = two.val;
        two.val = temp;

    }

    private void inOrder3(TreeNode node, List<TreeNode> inOrder)
    {
        if(node == null) return;
        inOrder3(node.left,inOrder);
        inOrder.add(node);
        inOrder3(node.right,inOrder);
    }
}
;