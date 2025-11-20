package strings.rotatestring796;

public class RotateString {

    public boolean rotateString(String s, String goal)
    {
        StringBuilder sb = new StringBuilder(s);
        for(int i =0;i<s.length();i++)
        {
            sb.append(s.charAt(i));
            sb.delete(0,1);
            if(sb.toString().equals(goal))
                return true;
        }
        return false;
    }
    // or
    public boolean rotateString2(String s, String goal)
    {
        if(s.length()!=goal.length())
            return false;
        String doubled = s+s;
        return doubled.contains(goal);
    }


}
