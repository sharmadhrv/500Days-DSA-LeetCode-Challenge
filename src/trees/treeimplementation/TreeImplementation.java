package trees.treeimplementation;

import com.sun.source.tree.Tree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TreeImplementation {


    private TreeNode root;

    public void insert(Scanner scanner)
    {
        System.out.println("enter root node :");
        int value = scanner.nextInt();
        root = new TreeNode(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, TreeNode node)
    {
        System.out.println("Do you want to enter the left node of "+ node.data+ " ? :");
        boolean left = scanner.nextBoolean();
        if(left)
        {
            System.out.println("enter the left child of "+node.data+" :");
            int value = scanner.nextInt();
            node.left = new TreeNode(value);
            populate(scanner,node.left);
        }

        System.out.println("Do you want to enter the right node of "+ node.data+ " ? :");
        boolean right = scanner.nextBoolean();
        if(right)
        {
            System.out.println("enter the right child of "+node.data+" :");
            int value = scanner.nextInt();
            node.right = new TreeNode(value);
            populate(scanner,node.right);
        }
    }

    public void display() {
        display(root,0);
    }

//    private void display(TreeNode node, int level) {
//        if (node == null) return;
//
//        display(node.right,level+1);
//        if(level!=0)
//        {
//            for(int i = 0;i<level;i++)
//            {
//                System.out.print("|\t");
//            }
//            System.out.println("----->"+node.data);
//        }
//        else
//            System.out.println(node.data);
//
//        display(node.left,level+1);
//    }

    private void display(TreeNode node, int level) {
        if (node == null) return;

        display(node.right, level + 1);

        // Print indentation (4 spaces per level)
        for (int i = 0; i < level; i++) {
            System.out.print("    ");   // 4 spaces
        }

        System.out.println(node.data);

        display(node.left, level + 1);
    }
}
