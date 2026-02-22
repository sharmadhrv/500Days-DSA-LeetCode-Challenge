package arrays.intersectionoftwoarrayII350;

import java.util.*;

public class IntersectionOfTwoArray {

    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0,j=0;
        List<Integer> result = new ArrayList<>();

        while(i<nums1.length && j < nums2.length)
        {
            if(nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j])
                i++;
            else
                j++;
        }

        i=0;
        int[] answer = new int[result.size()];
        for(int element : result)
        {
            answer[i++] = element;
        }
        return answer;
    }

    public int[] intersect2(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        int value=0;
        for(int i = 0;i< nums1.length;i++)
        {
            if(!map.containsKey(nums1[i]))
                map.put(nums1[i],1);
            else {
                value = map.get(nums1[i]);
                map.put(nums1[i], value + 1);
            }
        }

        for(int i = 0;i<nums2.length;i++)
        {
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0) {
                result.add(nums2[i]);
                value = map.get(nums2[i]);
                map.put(nums2[i], value - 1);
            }
        }

        int i = 0;
        int[] answer = new int[result.size()];
        for(int element : result)
        {
            answer[i++] = element;
        }
return answer;
    }

    public int[] intersection3(int[] nums1, int[] nums2)
    {
        int[] frequency = new int[1001];
        for(int ele : nums1)
            frequency[ele]++;

        int[] temp = new int[Math.min(nums1.length , nums2.length)];
        int k = 0 ;
        for(int ele : nums2)
        {
            if(frequency[ele]>0) {
                temp[k++] = ele;
                frequency[ele]--;
            }
        }

        int[] result = new int[k];
        for(int i = 0;i<k;i++)
            result[i] = temp[i];
        return result;
    }

    }
