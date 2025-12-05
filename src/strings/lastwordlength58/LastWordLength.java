package strings.lastwordlength58;

public class LastWordLength {

    public int wordLength(String s)
    {
//       String[] wordArray = s.split(" ");
//       return wordArray[wordArray.length-1].length();

        int i = s.length()-1;
        while(i>=0 && s.charAt(i)==' ')
            i--;
        int count=0;
        while(i>=0 && s.charAt(i)!=' ')
        {
            i--;
            count++;
        }
        return count;
    }

}
