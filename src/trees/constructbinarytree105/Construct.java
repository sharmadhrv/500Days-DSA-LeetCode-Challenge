package trees.constructbinarytree105;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;

public class Construct {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer,Integer> inorderMap = new HashMap<>();
        for(int i =0;i<inorder.length;i++)
            inorderMap.put(inorder[i],i);
        TreeNode root = buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,inorderMap);
        return root;
    }

    private static TreeNode buildTree(
            int[] preorder,int  preStart, int preEnd, int[]inorder, int inStart, int inEnd,
            Map<Integer, Integer> inorderMap)
    {
        TreeNode root =new TreeNode( preorder[preStart]);
        int inRoot = inorderMap.get(root.val);
        int numsLeft = inRoot-inStart;

        root.left = buildTree(preorder, preStart+1, preStart+numsLeft,
                inorder, inStart , inRoot-1,inorderMap);

        root.right = buildTree(preorder, preStart+numsLeft+1, preEnd,
                inorder, inRoot+1, inEnd, inorderMap);

        return root;
    }
}
