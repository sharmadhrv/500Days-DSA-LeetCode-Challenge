package strings.countandsay38;

public class CountAndSay {

    public String countAndSay(int n) {

        String s = "1";

        for(int index =0;index<n-1;index++)
        {
            s = stringCompression(s);
        }
        return s;
    }

    private String stringCompression(String s)
    {
        int index =0;
        StringBuilder sb = new StringBuilder();

        while(index <s.length())
        {
            char c = s.charAt(index);
            int count = 0;
            while(index<s.length() && c == s.charAt(index))
            {
                count++;
                index++;
            }

                String countStr = String.valueOf(count);
                for(char digit : countStr.toCharArray())
                {
                    sb.append(digit);
                }
            sb.append(c);
        }
        return sb.toString();
    }
}

