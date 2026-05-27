package trees.pathfromroottonode;

import java.util.ArrayList;
import java.util.List;

public class Path {

    public List<Integer> path(TreeNode root, TreeNode x)
    {
        List<Integer> result = new ArrayList<>();
        getPath(root, result, x);
        return result;
    }

    private boolean getPath(TreeNode root, List<Integer> result, TreeNode x)
    {
        if(root== null) return false;

        result.add(root.val);
        if(root.val== x.val) return true;

        if(getPath(root.left, result, x) || getPath(root.right, result, x))
            return true;

        result.removeLast();
        return false;
    }
}
