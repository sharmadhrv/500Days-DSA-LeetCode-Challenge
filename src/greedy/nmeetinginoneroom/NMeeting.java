package greedy.nmeetinginoneroom;

import java.util.Arrays;

public class NMeeting {

    public static class Data{
        int start;
        int end;
        int position;
    }

    public int count(int[] start,int[]end)
    {
        int n = start.length;

        Data[] arr = new Data[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = new Data();
            arr[i].start = start[i];
            arr[i].end = end[i];
            arr[i].position = i+1;
        }

        Arrays.sort(arr,(a,b)->a.end-b.end);
        int count = 1,lastEnd = arr[0].end;
        for(int i = 1;i<n;i++)
        {
            if(arr[i].start>lastEnd)
            {
                count++;
                lastEnd = arr[i].end;
            }
        }
        return count;
    }
}
