package miscellaneous.minimumbitflips2220;

public class MinimumBitFlips {
    public static void main(String[] args) {
        System.out.println(minBitFlips(3,4));
    }

    public static  int minBitFlips(int start, int goal) {
        int i =0;
       int  count = 0;
        while(start!=goal)
        {
            if((start & (1<<i)) != (goal & (1<<i)))
            {
                start = start^(1<<i);
                count++;
            }
            i++;
        }
        return count;
    }
    }
