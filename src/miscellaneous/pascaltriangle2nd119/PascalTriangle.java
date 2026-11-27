package miscellaneous.pascaltriangle2nd119;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<Integer> getRow(int rowIndex) {

        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<=rowIndex;i++)
        {
            ans.add((int)nCr(rowIndex,i));
        }
        return ans;
    }

    private long nCr(int n, int r)
    {
        long ans=1;
        for(int i =0;i<r;i++)
        {
            ans = ans*((n-i)/(i+1));
        }
        return ans;
    }

}
