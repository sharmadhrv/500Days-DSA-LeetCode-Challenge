package trees.binarytreemaxpathsum124;

import com.sun.source.tree.Tree;

public class MaxPathSum {

    public int maxPathSum(TreeNode root) {

        int[] maxSum = new int[1];
        maxSum[0] = Integer.MIN_VALUE;
        height(root,maxSum);
        return maxSum[0];
    }

    private int height(TreeNode root, int[] maxSum)
    {
        if(root == null)
            return 0;

        int leftSum = Math.max(0,height(root.left,maxSum));
        int rightSum = Math.max(0, height(root.right, maxSum));

        maxSum[0] = Math.max(maxSum[0], root.val + leftSum + rightSum);
        return root.val+  Math.max(leftSum,rightSum);
    }

}
