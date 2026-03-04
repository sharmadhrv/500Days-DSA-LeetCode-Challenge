package trees.bstimplementation;

public class TreeNode {

    int data;
    TreeNode left;
   TreeNode right;
   int height;

    TreeNode(){
    }

    TreeNode(int data){
        this.data = data;
    }

    TreeNode(int data, TreeNode left, TreeNode right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
