package greedy.minplatformrequired;

import java.util.Arrays;

public class PlatformRequired {

    public int function(int[] arrival, int[] departure)
    {
        int n= arrival.length;
        int i=0,j=0;
        int count = 0,maxCount = 0;
        Arrays.sort(arrival);
        Arrays.sort(departure);
        while(i<n)
        {
            if(arrival[i] <= departure[j])
            {
                i++;
                count++;
            }
            else{
                j++;
                count--;
            }
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
}
