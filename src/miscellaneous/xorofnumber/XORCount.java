package miscellaneous.xorofnumber;

public class XORCount {

    /**
     * @param args
     * iven two integers L and R. Find the XOR of the elements in the range [L , R].
     * Example 1
     * Input : L = 3 , R = 5
     * Output : 2
     * Explanation : answer = (3 ^ 4 ^ 5) = 2.
     */
    public static void main(String[] args) {
        System.out.println(findRangeXOR(4,10));
    }

    public static int findRangeXOR(int l, int r) {
      return findXor(l-1) ^ findXor(r);
    }
    private static int findXor(int n)
    {
        if(n%4 == 0) return n;
        if(n%4 == 1) return 1;
        if(n%4 == 2) return n+1;
        return 0;
    }
}
