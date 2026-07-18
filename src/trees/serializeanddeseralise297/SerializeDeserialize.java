package trees.serializeanddeseralise297;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserialize {

    public String serialize(TreeNode root) {

        Queue<TreeNode> queue= new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            TreeNode node= queue.poll();
            if(node == null)
                sb.append("n ");
            else {
                sb.append(node.val+" ");
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        return sb.toString();
    }

    public TreeNode deSerialize(String data)
    {
        if (data.isEmpty() ) return null;
        String[] c = data.trim().split(" ");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(c[0]));
        queue.offer(root);

        for(int i =1;i<c.length;i++)
        {
            TreeNode parent = queue.poll();
            if(!c[i].equals("n")) {
                TreeNode left = new TreeNode(Integer.parseInt(c[i]));
                parent.left = left;
                queue.offer(left);
            }

            if(!c[++i].equals("n")){
                TreeNode right = new TreeNode(Integer.parseInt(c[i]));
                parent.right = right;
                queue.offer(right);
            }
        }

        return root;
    }

}
