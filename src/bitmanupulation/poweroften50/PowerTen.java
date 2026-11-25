package bitmanupulation.poweroften50;

public class PowerTen {

    public double myPow(double x, int n) {

        double base = x;
        long power = n;
        if(power<0)
        {
            base = 1.0/base;
            power = -power;
        }
        double ans = 1;
        while(power != 0)
        {
            long last = power & 1;
            if(last == 1)
                ans = ans * base;
            base = base * base;
            power =  power >> 1;
        }
        return ans;
    }
}
