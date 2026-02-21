package strings.substringwithall3character1358;



public class SubstringWith3Character {

    public int numberOfSubstrings(String s) {

        int aCount = -1, bCount = -1, cCount = -1;
        int right, left = 0, count = 0, min;
        for(right = 0;right <s.length();right++)
        {
            char c = s.charAt(right);
            if(c == 'a')
                aCount = right;
            else if(c=='b')
                bCount = right;
            else if(c == 'c')
                cCount = right;

            if(aCount > -1 && bCount > -1 && cCount> -1)
            {
                min = min(aCount,bCount,cCount);
                count = count +(1+min);
            }
        }
        return count;
    }

    private int min(int a , int b , int c)
    {
        if(a<b)
        {
            if(a<c)
                return a;
            else return c;
        }
        else
        {
            if(b<c)
                return b;
            return c;
        }
    }

}
