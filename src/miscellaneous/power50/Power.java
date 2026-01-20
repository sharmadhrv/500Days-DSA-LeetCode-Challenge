package miscellaneous.power50;

public class Power {

    public static void main(String[] args) {
        System.out.println(myPow(5,-2147483648));

    }
    public static double myPow(double x, int n) {
        double base = x;
        long power = n;
        if(power<0)
        {
            base = 1.0/x;
            power = -power;
        }
        double answer = 1;

        while(power!=0)
        {
            if((power & 1)== 1)
                answer = answer * base;
            base = base * base;
            power = power >> 1;
        }
        return answer;
    }

}
