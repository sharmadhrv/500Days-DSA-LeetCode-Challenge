package binarysearchtree.lowestcommonancestor235;

public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      TreeNode ans = helper(root,p,q);
      return ans;
    }

    private TreeNode helper(TreeNode node, TreeNode p, TreeNode q)
    {
        if(node == null || node == p || node == q) return node;
        if(node.val > p.val && node.val > q.val)
        {
            return  helper(node.left,p,q);
        }
        if(node.val < p.val && node.val < q.val)
            return helper(node.right,p,q);
        else return node;

    }
}
