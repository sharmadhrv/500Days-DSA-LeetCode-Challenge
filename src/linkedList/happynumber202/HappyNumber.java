package linkedList.happynumber202;

public class HappyNumber {

    public boolean isHappy(int n)
    {
        int slow =n;
        int fast = n;
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));

        }while(slow!= fast);
        if(slow == 1)
            return true;
        return false;
    }

    private int findSquare(int n)
    {
        int sum =0;
        int digit;
        while(n>0)
        {
            digit = n%10;
            sum += (int)Math.pow(digit,2);
            n = n/10;
        }
        return sum;
    }

}
