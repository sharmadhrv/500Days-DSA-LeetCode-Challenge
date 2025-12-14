package strings.longestPalindromicSubstring5;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        int length = 0;
        int startIndex=0, endIndex=0;
        for(int i =0;i<s.length()-1;i++)
        {
            for(int j = i;j<s.length();j++)
            {
                if(isPalindromic(i,j,s))
                {
                    if((j-i+1)>length) {
                        startIndex = i;
                        endIndex = j;
                        length = j - i + 1;
                    }
                }
            }
        }
        return s.substring(startIndex,endIndex+1);
    }

    private boolean isPalindromic(int i,int j ,String s)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            else{
                j--;
                i++;
            }
        }
        return true;
    }

}
