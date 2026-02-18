package strings.longestrepeatedcharacterreplacement424;

public class CharacterReplacement {

    public int characterReplacement(String s, int k) {

        int right ,left = 0;
        int maxFrequency = 0, length, maxLength= 0;
        int[] hashArray = new int[26];
        for(right = 0;right<s.length();right++)
        {
            hashArray[s.charAt(right)-'A']++;
            maxFrequency = Math.max(maxFrequency,hashArray[s.charAt(right)-'A']);
            length = right -left+1;

            while((length-maxFrequency)>k)
            {
                hashArray[s.charAt(left)-'A']--;
                left++;
                maxFrequency = 0;
                for(int i = 0;i<26;i++)
                    maxFrequency = Math.max(maxFrequency,hashArray[i]);
                length = right - left+1;
            }
            if((length-maxFrequency)<=k)
            {
                maxLength = Math.max(maxLength,length);
            }
        }
        return maxLength;
    }
}