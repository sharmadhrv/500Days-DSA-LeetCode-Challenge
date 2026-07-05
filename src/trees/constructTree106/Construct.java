package trees.constructTree106;

import java.util.HashMap;
import java.util.Map;

public class Construct {
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        Map<Integer, Integer> inOrderMap = new HashMap<>();
        for(int i =0;i<inorder.length;i++)
            inOrderMap.put(inorder[i],i);

        TreeNode root = construct(postorder,0,postorder.length-1,inorder,0,inorder.length-1,inOrderMap);

        return root;
    }

    private static TreeNode construct(int[] postorder,int postStart, int postEnd,
            int[] inorder, int inStart , int inEnd ,
                                      Map<Integer,Integer> inOrderMap)
    {
        if(inStart>inEnd|| postStart> postEnd) return null;

        TreeNode root = new TreeNode(postorder[postEnd]);
        int inRoot = inOrderMap.get(root.val);
        int leftNum = inRoot - inStart;

        root.left = construct(postorder, postStart, postStart+leftNum-1,
                inorder,inStart,inRoot-1,inOrderMap);

        root.right = construct(postorder,postStart+leftNum ,postEnd-1,
                inorder, inRoot+1, inEnd,inOrderMap);

        return root;
    }


}
