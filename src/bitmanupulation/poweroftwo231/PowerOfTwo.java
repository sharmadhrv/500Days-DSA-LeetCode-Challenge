package bitmanupulation.poweroftwo231;

public class PowerOfTwo {

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(-2147483648));
    }
    public static boolean isPowerOfTwo(int n) {
        if(n == 0 || n==Integer.MIN_VALUE || n==Integer.MAX_VALUE)
            return false;
        return (n & (n - 1)) ==0;
    }

}
