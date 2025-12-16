package recursion.removecharacterfromstring;

public class SkipCharacter {

    public  void skipCharacter(String processdeString, String unProcessedString)
    {
        if(unProcessedString.isEmpty())
        {
            System.out.println(processdeString);
            return;
        }
        char ch = unProcessedString.charAt(0);
        if(ch == 'a')
        {
            skipCharacter(processdeString, unProcessedString.substring(1));
        }
        else{
            skipCharacter(processdeString+ch, unProcessedString.substring(1));
        }
    }

    public  String skipCharacter2( String unProcessedString) {

        if(unProcessedString.isEmpty())
            return "";

        char ch = unProcessedString.charAt(0);
        if(ch == 'a')
        {
            return skipCharacter2(unProcessedString.substring(1));
        }
        else {
            return ch + skipCharacter2(unProcessedString.substring(1));
        }
    }
}
