package arrays.subsets78;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> answer = subsets(nums);
       for(List<Integer> list : answer)
            System.out.println(list);
    }
    public static  List<List<Integer>> subsets(int[] nums) {

      int n = nums.length;
      List<List<Integer>> answer = new ArrayList<>();
      for(int i=0;i<(1<<n);i++)
        {
            answer.add(helpingFunction(i,nums));
        }
      return answer;
    }

    private static  List<Integer> helpingFunction(int num,int[] nums)
    {
        List<Integer> list = new ArrayList<>();
        int i =0;
        while(i<nums.length)
        {
            if((num & (1<<i) )!= 0) {
                list.add(nums[i]);
            }
            i++;
        }
        return list;
    }

}
