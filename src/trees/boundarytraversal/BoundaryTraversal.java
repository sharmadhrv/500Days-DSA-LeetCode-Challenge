package trees.boundarytraversal;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal {
    public List<Integer> boundaryTraversal(TreeNode root)
    {
        List<Integer> result = new ArrayList<>();

        if(!isLeaf(root))
            result.add(root.val);
        addLeftBound(root,result);
        addLeaf(root,result);
        addRightBound(root,result);
        return result;
    }

    private boolean isLeaf(TreeNode root)
    {
        return root.left == null && root.right == null;
    }

    private void addLeftBound(TreeNode root, List<Integer> result)
    {
        TreeNode cur = root.left;
        while(cur!=null)
        {
          if(!isLeaf(cur)) result.add(cur.val);
          if(cur.left!=null) cur = cur.left;
          else cur = cur.right;
        }
    }

    private void addLeaf(TreeNode root, List<Integer>result)
    {
        if(root == null) return;
        if(isLeaf(root)) result.add(root.val);

        addLeaf(root.left, result);
        addLeaf(root.right, result);
    }

    private void addRightBound(TreeNode root, List<Integer> result )
    {
        TreeNode cur = root.right;
        List<Integer> temp = new ArrayList<>();

        while(cur!=null)
        {
            if(!isLeaf(cur)) temp.add(cur.val);
            if(cur.right!=null) cur =cur.right;
            else cur = cur.left;
        }
        for(int i = temp.size()-1;i>=0;i--)
            result.add(temp.get(i));
    }
}
