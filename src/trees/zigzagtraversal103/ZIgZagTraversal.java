package trees.zigzagtraversal103;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZIgZagTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new LinkedList<>();
        List<List<Integer>> levelOrder = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) return result;

        queue.offer(root);

        while(!queue.isEmpty())
        {
            int n = queue.size();
            List<Integer> subList = new LinkedList<>();
            for(int i = 0;i<n;i++)
            {
                if(queue.peek().left!=null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right!=null)
                    queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            levelOrder.add(subList);
        }
        for(int i = 0;i<levelOrder.size();i++)
        {
            if(i%2==0)
                result.add(levelOrder.get(i));
            else result.add(levelOrder.get(i).reversed());
        }
        return result;
    }
}
