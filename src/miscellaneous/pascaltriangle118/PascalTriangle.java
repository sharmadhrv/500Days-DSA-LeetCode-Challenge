package miscellaneous.pascaltriangle118;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {

            List<Integer> temp = new ArrayList<>();
            for (int j = 1; j <= i; j++)
                temp.add(nCr(i-1,j-1));
            ans.add(temp);
        }
        return ans;
    }

        private int nCr(int n, int r)
        {
            int ans=1;
            for(int i =0;i<r;i++)
            {
                ans = ans * (n-i)/(i+1);
            }
            return ans;
        }

        // to print the triangle

    public void printTriangle(int n)
    {
        for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print(nCr(i-1,j-1)+"  ");
            System.out.println();
        }
    }
}
