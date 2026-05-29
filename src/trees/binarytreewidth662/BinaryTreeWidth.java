package trees.binarytreewidth662;

import com.sun.source.tree.Tree;

import java.util.*;

public class BinaryTreeWidth {

    private static class Tuple{
        TreeNode node;
        int index;

        private Tuple(TreeNode node , int index)
        {
            this.node = node;
            this.index = index;
        }
    }

    public int widthOfBinaryTree(TreeNode root)
    {
        Queue<Tuple> queue = new LinkedList<>();
        int ans =0;

        if(root == null) return 0;
        queue.offer(new Tuple(root,0));

        while(!queue.isEmpty())
        {
            int n = queue.size();
            int min_value = queue.peek().index;
            int first = 0,last=0;
            for(int i =0;i<n;i++)
            {
                Tuple tuple = queue.poll();
                TreeNode node = tuple.node;
                int index = tuple.index-min_value;
                if(i==0) first = index;
                if(i == n-1) last = index;

                if(node.left!=null)
                    queue.offer(new Tuple(node.left, 2*index+1));
                if(node.right!=null)
                    queue.offer(new Tuple(node.right, 2*index+2));
            }
            ans = Math.max(ans,last-first+1);
        }
        return ans;
    }
}
