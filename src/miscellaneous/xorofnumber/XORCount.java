package miscellaneous.xorofnumber;

public class XORCount {
    public static void main(String[] args) {
        System.out.println(findRangeXOR(4,10));
    }

    public static int findRangeXOR(int l, int r) {
        int count = 0;

        for(int i = l;i<=r;i++)
        {
            count = count^i;
        }
        return count;
    }

}
