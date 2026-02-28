package strings.minimumwindoesubstring76;

public class MinimumWindowSubString {

    public String minWindow(String s, String t) {
        int left = 0,right , count = 0, startingIndex = -1;
        int minLength = Integer.MAX_VALUE;

        int[] frequency = new int[256];

        for(char c : t.toCharArray())
            frequency[c]++;

        for(right = 0;right < s.length();right++)
        {
            char c = s.charAt(right);
            if(frequency[c]>0)
                count++;
            frequency[c]--;

            while(count == t.length())
            {
                if((right-left+1)<minLength)
                {
                    minLength = right-left+1;
                    startingIndex = left;
                }
                frequency[s.charAt(left)]++;
                if(frequency[s.charAt(left)]>0)
                    count--;
                left++;
            }
        }
        return startingIndex == -1 ? "" : s.substring(startingIndex, startingIndex+minLength);

    }
}
