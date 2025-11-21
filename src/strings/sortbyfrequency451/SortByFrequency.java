package strings.sortbyfrequency451;

public class SortByFrequency {

    public String frequencySort(String s)
    {
        int[] arr = new int[26];
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray())
        {
            arr[c-'a']++;
        }
        int index = 0;
        int max = Integer.MIN_VALUE;
        for( int i =0;i<arr.length;i++)
        {
            if (arr[i]> max) {
                max = arr[i];
                index = i;
            }

        }
        for(int j =0;j<max;j++)
        {
            sb.append((char)(index+97));

        }
        return sb.toString();
    }

}
