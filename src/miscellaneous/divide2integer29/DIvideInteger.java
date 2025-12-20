package miscellaneous.divide2integer29;

public class DIvideInteger {

    public int divide(int dividend, int divisor) {

        int negative = 1;
        if(dividend < 0) {
            dividend = Math.abs(dividend);
            negative *= -1;
        }
        if(divisor <0)
        {
            divisor = Math.abs(divisor);
            negative *= -1;
        }

        int  quotient = 0;
        while(dividend>0)
        {
            if(dividend >=divisor)
                quotient ++;
            dividend -=divisor;

        }
        return  quotient*negative;
    }
}
