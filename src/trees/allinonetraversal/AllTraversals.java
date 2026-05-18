package trees.allinonetraversal;

import com.sun.source.tree.Tree;

import java.util.*;

public class AllTraversals {

    public static class Pair{
        TreeNode node;
        int num;
    }


    public List<List<Integer>> allOrder(TreeNode root)
    {
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        List<List<Integer>> result =new ArrayList<>();

        if(root == null) return result;

        Stack<Pair> stack = new Stack<>();
        Pair pair = new Pair();
        pair.node= root;
        pair.num = 1;

        stack.push(pair);

        while(!stack.isEmpty())
        {
          pair = stack.pop();
          if(pair.num == 1)
          {
              pre.add(pair.node.val);
              pair.num++;
              stack.push(pair);
              if(pair.node.left!=null){
                  Pair temp = new Pair();
                  temp.node = pair.node.left;
                  temp.num = 1;
                  stack.push(temp);
              }
          }
          else if(pair.num==2){
              in.add(pair.node.val);
              pair.num++;
              stack.push(pair);
              if(pair.node.right!=null)
              {
                  Pair temp = new Pair();
                  temp.node = pair.node.right;
                  temp.num = 1;
                  stack.push(temp);
              }
          }
          else if (pair.num== 3)
          {
              post.add(pair.node.val);
          }


        }

        result.add(pre);
        result.add(in);
        result.add(post);
        return result;
    }
}
