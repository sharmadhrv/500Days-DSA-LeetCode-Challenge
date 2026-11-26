package miscellaneous.sqrt69;

public class Sqrt {

    public int mySqrt(int x) {

        int start = 0;
        int root=0;
        int end = x;
        while(start<=x)
        {

            int mid = start+(x-start)/2;
            long sq =(long) mid * mid;

            if(sq == end) return mid;

            else if(sq < x)
            {
                root = mid;
                start = mid+1;
            }
            else x = mid-1;
        }
        return root;
    }
}
