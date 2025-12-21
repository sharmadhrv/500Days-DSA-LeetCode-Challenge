package strings.subsequence;

import java.util.ArrayList;

public class SubSequenceRecurrsive {

    public static void main(String[] args) {
        subsequence("","abc");
        ArrayList<String> answer =new ArrayList<>();
       subSequenceWithASCII("","abc",answer);
        System.out.println(answer);
        System.out.println(subSequenceAsciiRet("","abc"));
    }

    public static void subsequence(String processed, String unProcessed)
    {
        if(unProcessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }
        char ch = unProcessed.charAt(0);
        subsequence(processed+ch,unProcessed.substring(1));
        subsequence(processed,unProcessed.substring(1));

    }

    public static ArrayList<String> subSequenceList(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unProcessed.charAt(0);
        ArrayList<String> left = subSequenceList(processed+ch,unProcessed.substring(1));
        ArrayList<String> right = subSequenceList(processed,unProcessed.substring(1));
        left.addAll(right);
        return left;
    }

    public static void subSequenceList2(String processed, String unProcessed, ArrayList<String> list) {
        if (unProcessed.isEmpty()) {
            list.add(processed);
            return ;
        }
        char ch = unProcessed.charAt(0);
        subSequenceList2(processed+ch,unProcessed.substring(1),list);
         subSequenceList2(processed,unProcessed.substring(1),list);
    }

    public static void subSequenceWithASCII(String processed, String unProcessed, ArrayList<String> list) {
        if (unProcessed.isEmpty()) {
            list.add(processed);
            return ;
        }
        char ch = unProcessed.charAt(0);
        subSequenceWithASCII(processed+ch,unProcessed.substring(1),list);
        subSequenceWithASCII(processed+(ch+0),unProcessed.substring(1),list);
        subSequenceWithASCII(processed,unProcessed.substring(1),list);
    }

    public static ArrayList<String> subSequenceAsciiRet(String p , String u)
    {
        if(u.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = u.charAt(0);
        ArrayList<String> first = subSequenceAsciiRet(p+ch,u.substring(1));
        ArrayList<String> second = subSequenceAsciiRet(p,u.substring(1));
        ArrayList<String> third = subSequenceAsciiRet(p+(ch+0),u.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;

    }



}
