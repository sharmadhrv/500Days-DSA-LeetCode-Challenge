package recursion.stepstoreducezero1342;

public class ReducedZero {

    public int numberOfSteps(int num) {
        int count = 0;
        count = countSteps(num,count);
        return count;
    }
    private int countSteps(int num, int count)
    {
        if(num == 0)
            return count;
        else {
            if(num%2 ==0)
                return countSteps(num/2,count+1);
            else
                return countSteps(num-1,count+1);
        }
    }

}
