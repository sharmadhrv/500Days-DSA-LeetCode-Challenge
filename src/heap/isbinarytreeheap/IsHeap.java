package heap.isbinarytreeheap ;

public class IsHeap {
    public boolean isHeap(Node tree)
    {
        int index = 0;
        int totalCount = count(tree);
        if(isCBT( tree,index , totalCount) && isMaxOrder(tree))
            return true;
        return false;
    }

    private int count(Node root)
    {
        if(root == null)
            return 0;
        int answer = 1+ count(root.left)+ count(root.right);
        return answer;
    }

    private boolean isCBT(Node node ,int  index , int totalCount)
    {

        if(node == null)
            return true;
       if(index >= totalCount)
       {
           return false;
       }
       else {
           boolean left = isCBT(node.left,2*index+1,totalCount);
           boolean right = isCBT(node.right,2*index+2,totalCount);
           return (left && right);
       }
    }

    private boolean isMaxOrder(Node root)
    {
            if(root.left == null && root.right == null)return true;

        if(root.right== null)
        {
            return root.data>root.left.data && isMaxOrder(root.left);
        }
        else {
            boolean left = isMaxOrder(root.left);
            boolean right = isMaxOrder(root.right);

            return left&& right && root.data > root.left.data && root.data > root.right.data;
        }
    }
}
