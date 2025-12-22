package recursion.permutation;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PermutationString {

    public static void main(String[] args) {

        permutedString("","abc");
        System.out.println(permutationList("","abc"));
        System.out.println(permutationCount("","abcd"));
    }

    public static void  permutedString(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
;            return;
        }
        char c = up.charAt(0);
        for(int i =0;i<=p.length();i++)
        {
           String first = p.substring(0,i);
           String second = p.substring(i);
           permutedString(first+c+second, up.substring(1));
        }
    }


    public static ArrayList<String> permutationList(String p , String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char c = up.charAt(0);
        ArrayList<String> localCallList = new ArrayList<>();
        for(int i =0;i<=p.length();i++)
        {
            String first = p.substring(0,i);
            String second = p.substring(i);
            localCallList.addAll(permutationList(first+c+second,up.substring(1)));
        }
        return localCallList;
    }
    public static int   permutationCount(String p , String up)
    {
        if(up.isEmpty())
        {
          return 1;
        }
        char c = up.charAt(0);
        int size =0;
        for(int i =0;i<=p.length();i++)
        {
            String first = p.substring(0,i);
            String second = p.substring(i);
            size= size + permutationCount(first+c+second, up.substring(1));
        }
        return size;
    }
}
