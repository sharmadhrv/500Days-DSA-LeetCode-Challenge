package trees.verticalordertraversal987;

import java.util.*;

public class VerticalOrder {

    public static class Tuple{
        TreeNode node;
        int row;
        int col;

        Tuple(TreeNode node, int row, int col)
        {
            this.node = node;
            this.col = col;
            this.row = row;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        Queue<Tuple> queue = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        if(root ==null) return result;

        Tuple tuple = new Tuple(root,0,0);
        queue.add(tuple);

        while(!queue.isEmpty())
        {
            tuple = queue.poll();
            TreeNode node = tuple.node;
            int row = tuple.row;
            int col = tuple.col;

            map.putIfAbsent(col, new TreeMap<>());
            map.get(col).putIfAbsent(row, new PriorityQueue<>());
            map.get(col).get(row).offer(node.val);

            if(node.left!=null)
                queue.offer(new Tuple(node.left, row+1,col-1));

            if(node.right!=null)
                queue.offer(new Tuple(node.right,row+1,col+1));
        }

        for(TreeMap<Integer, PriorityQueue<Integer>> internal : map.values())
        {
            List<Integer> subList = new LinkedList<>();
            for(PriorityQueue<Integer> node : internal.values())
            {
                while(!node.isEmpty())
                    subList.add(node.poll());
            }
            result.add(subList);
        }
        return result;
    }
}
