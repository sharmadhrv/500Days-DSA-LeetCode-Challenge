package binarysearchtree.constructBSTusingprrorder1008;

import com.sun.source.tree.Tree;

public class Construct {
    public TreeNode bstFromPreorder(int[] preorder) {

        TreeNode answer = helper(preorder,Integer.MAX_VALUE,new int[] {0});
        return answer;

    }

    private TreeNode helper (int[] preOrder, int upperBound, int[] i)
    {
        if(i[0] == preOrder.length || preOrder[i[0]]>upperBound) return null;
        TreeNode root = new TreeNode(preOrder[i[0]++]);
        root.left = helper(preOrder,root.val,i);
        root.right = helper(preOrder,upperBound,i);
        return root;
    }
}
