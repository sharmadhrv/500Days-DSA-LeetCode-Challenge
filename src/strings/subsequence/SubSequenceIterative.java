package strings.subsequence;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class SubSequenceIterative {

    public static void main(String[] args) {
        char[] arr = {'a','b','b','c'};
        System.out.println(subSequenceNODuplicate(arr));
    }

    public static List<String> subSequence(char[] arr){
        List<String> outer = new ArrayList<>();
        outer.add("");
        for(char c : arr)
        {
            int n = outer.size();
            for(int i =0;i< n;i++)
            {
                   outer.add(outer.get(i)+c);
            }
        }
        outer.remove("");
        return outer;
    }
    public static List<String> subSequenceNODuplicate(char[] arr)
    {
        List<String> outer = new ArrayList<>();
        outer.add("");
        for(char c : arr)
        {
            int n = outer.size();
            for(int i =0;i< n;i++)
            {
                if(!outer.get(i).contains(String.valueOf(c))) {
                    StringBuilder internal = new StringBuilder(outer.get(i));
                    internal.append(c);
                    outer.add(internal.toString());
                }
            }
        }
        outer.remove("");
        return new ArrayList<>(new LinkedHashSet<>(outer));
    }
}
