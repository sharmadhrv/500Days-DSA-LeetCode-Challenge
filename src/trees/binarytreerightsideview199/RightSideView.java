package trees.binarytreerightsideview199;

import com.sun.source.tree.Tree;

import java.util.*;

public class RightSideView {


    public List<Integer> rightSideView(TreeNode root) {

       List<Integer> result = new ArrayList<>();
       int level = 0;
       helper(root,result,level);
       return result;
    }

    private void helper(TreeNode node, List<Integer> result , int level)
    {
        if(node == null ) return;

        if(result.size() == level)
            result.add(node.val);

        helper(node.right,result,level+1);
        helper(node.left, result, level+1);
    }
}