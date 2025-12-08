package searchingSorting.sqrtofanumber69;

public class Sqrt {

    public int mySqrt(int x)
    {
        int start =0;
        int end = x;
        double root =0;
        while(start<=end) {
            int mid = start+(end - start) / 2;
            long sq = (long) mid * mid;
            if (sq == x)
                return mid;
            else if (sq < x) {
                root = mid;
                start = mid + 1;
            }
            else
                end = mid - 1;
        }
//            double incr = 0.1;
//            for(int i=0;i<2;i++)
//            {
//                while((root+incr)*(root+incr) <=x)
//                    root+=incr;
//                incr/=10;
//
//            }
        return (int)root;
    }

}
