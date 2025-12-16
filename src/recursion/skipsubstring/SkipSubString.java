package recursion.skipsubstring;

public class SkipSubString {

    public String skipSubString(String pattern,String unProcessedString)
    {
        if(unProcessedString.isEmpty())
            return"";
        if(unProcessedString.startsWith(pattern))
            return skipSubString(pattern,unProcessedString.substring(pattern.length()));
        else
            return unProcessedString.charAt(0)+ skipSubString(pattern,unProcessedString.substring(1));
    }

}
