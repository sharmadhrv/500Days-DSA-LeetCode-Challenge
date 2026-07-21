package binarysearchtree.validateBST98;

public class Validate {
    public boolean isValidBST(TreeNode root) {
        boolean answer = isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
        return answer;
    }

    private boolean isValid(TreeNode node, long  minVal , long maxVal)
    {
        if(node== null) return true;

        if(node.val <= minVal ||  node.val >= maxVal) return false;
        return isValid(node.left,minVal,node.val)
                && isValid(node.right,node.val,maxVal);
    }
}
