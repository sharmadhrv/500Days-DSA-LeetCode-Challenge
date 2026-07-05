package trees.countcompletetreenodes222;

public class CountComplete {

    public int countNodes(TreeNode root) {

        if(root == null) return 0;

        int leftHeight = getLeftTreeHeight(root);
        int rightHeight = getRightHeight(root );

        if(leftHeight == rightHeight)
            return (int)Math.pow(2,leftHeight);
        else return 1+ countNodes(root.left) + countNodes(root.right);
    }

    private int getLeftTreeHeight(TreeNode root)
    {
        int count = 0;
        while(root !=null)
        {
            count++;
            root =root.left;
        }
        return count;
    }

    private int getRightHeight(TreeNode root)
    {
        int count = 0;
        while(root!=null){
            count++;
            root = root.right;
        }
        return count;
    }
}
