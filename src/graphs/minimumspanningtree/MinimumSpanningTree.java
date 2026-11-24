package graphs.minimumspanningtree;

import java.util.ArrayList;
import java.util.List;

public class MinimumSpanningTree {

        List<Integer> rank = new ArrayList<>();
        List<Integer> parent = new ArrayList<>() ;

        MinimumSpanningTree(int n)
        {
            for(int i =0;i<=n;i++)
            {
                rank.add(0);
                parent.add(i);
            }
        }

    public int ultimateParent(int node)
    {
        if(node == parent.get(node))
            return node;
        int  ulP = ultimateParent(parent.get(node));
        parent.set(node,ulP);
        return parent.get(node);
    }

    public void findUnionByRank(int u, int v)
    {
        int ultimateParentU = ultimateParent(u);
        int ultimateParentV =ultimateParent(v);

        if(ultimateParentU == ultimateParentV) return ;

        if(rank.get(ultimateParentU)<rank.get(ultimateParentV)) {
            parent.set(ultimateParentU, ultimateParentV);
        }

        else if(rank.get(ultimateParentU)>rank.get(ultimateParentV))
        {
            parent.set(ultimateParentV,ultimateParentU);
        }

        else {
            parent.set(ultimateParentV, ultimateParentU);
            int rankU = rank.get(ultimateParentU);
            rank.set(ultimateParentU, rankU + 1);
        }
    }

    public static void main(String[] args) {
            MinimumSpanningTree tree = new MinimumSpanningTree(7);

            tree.findUnionByRank(1,2);
        tree.findUnionByRank(2,3);
        tree.findUnionByRank(4,5);
        tree.findUnionByRank(6,7);
        tree.findUnionByRank(5,6);


        if(tree.ultimateParent(3)==tree.ultimateParent(7))
            System.out.println("same");
        else System.out.println("not same");

        tree.findUnionByRank(3,7);

        if(tree.ultimateParent(3)==tree.ultimateParent(7))
            System.out.println("same");
        else System.out.println("not same");


    }
}
