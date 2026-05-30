package trees.nodesatdistancek863;

import linkedList.removenode2487.RemoveNode;

import java.util.*;

public class DistanceKNodes {

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        parentPointer(root, parentMap);

        Queue<TreeNode> queue = new LinkedList<>();
         Map<TreeNode, Boolean> visited = new HashMap<>();

         queue.offer(target);
         visited.put(target,true);
         int curDistance = 0;

         while(!queue.isEmpty())
         {
             if(curDistance == k) break;
             int n = queue.size();
             curDistance++;

             for(int i = 0;i<n;i++)
             {
                 TreeNode node = queue.poll();
                 if(node.left!=null && visited.get(node.left) == null)
                 {
                     queue.offer(node.left);
                     visited.put(node.left, true);
                 }

                 if(node.right!=null && visited.get(node.right) == null)
                 {
                     queue.offer(node.right);
                     visited.put(node.right, true);
                 }

                 if(parentMap.get(node)!=null && visited.get(parentMap.get(node)) == null)
                 {
                     queue.offer(parentMap.get(node));
                     visited.put(parentMap.get(node),true);
                 }
             }
         }

         List<Integer> answer = new ArrayList<>();
         while(!queue.isEmpty())
             answer.add(queue.poll().val);

         return answer;
    }

    private void parentPointer(TreeNode root, Map<TreeNode, TreeNode> map)
    {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null ) {
                map.put(node.left, node);
                queue.offer(node.left);
            }
            if (node.right != null) {
                map.put(node.right, node);
                queue.offer(node.right);
            }
        }
    }
}
