package trees.leverordertraversal102;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();

        if(root == null) return list;

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
            list.add(subList);
        }
        return list;
    }
}
