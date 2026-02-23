package arrays.maximumpointsfromcard1423;

public class MaximumPoints {

    public int maxScore(int[] cardPoints, int k) {

        int lSum = 0, rSum = 0;
        for(int i = 0;i<k;i++)
        {
            lSum = lSum + cardPoints[i];
        }
        int sum = lSum + rSum;
        int size = cardPoints.length-1;
        for(int i = k-1;i>=0;i--)
        {
            lSum = lSum - cardPoints[i];
            rSum = rSum + cardPoints[size--];
            sum = Math.max(sum , lSum+rSum);
        }
return sum;
    }
}
