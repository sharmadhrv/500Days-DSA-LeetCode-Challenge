package binarysearchtree.kthsmallestelement230;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElement {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> answer = new ArrayList<>();
        inOrder(root, answer);
        return answer.get(k-1);
    }

    private  void inOrder(TreeNode root, List<Integer> answer)
    {
        if(root == null) return;
        inOrder(root.left,answer);
        answer.add(root.val);
        inOrder(root.right,answer);
    }
}
