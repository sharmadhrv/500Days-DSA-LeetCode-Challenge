package trees.topview;

import java.util.*;

public class TopView {

    public static  class Tuple{
        TreeNode node;
        int col ;
        public Tuple(TreeNode node ,int col)
        {
            this.node = node;
            this.col = col;
        }
    }

    public List<Integer> topView(TreeNode root)
    {
        List<Integer> result = new LinkedList<>();
        Queue<Tuple> queue = new LinkedList<>();
        TreeMap<Integer,Integer>map = new TreeMap<>();

        if(root==null) return result;

        queue.offer(new Tuple(root,0));

        while(!queue.isEmpty())
        {
            Tuple tuple = queue.poll();
            TreeNode node = tuple.node;
            int col = tuple.col;
            map.putIfAbsent(col,node.val);


            if(node.left!=null)
                queue.offer(new Tuple(node.left, col-1));
            if(node.right!=null)
                queue.offer(new Tuple(node.right,col+1));
        }
        result.addAll(map.values());
        return result;
    }
}
