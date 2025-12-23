package recursion.amazondiceproblem;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class DiceCombination {

    public static void main(String[] args) {
        System.out.println(combinationDice(4));
    }

    public static List<String> combinationDice(int diceFace)
    {
        List<String> answer = help("",diceFace);
        return new ArrayList<>(new LinkedHashSet<>(answer));
    }

    private static List<String> help(String p,int up){
        if(up==0)
        {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> answer = new ArrayList<>();
        for(int i =1;i<=6 && i<=up;i++)
        {

                List<String> temp = help(p + i, up - i);
                answer.addAll(temp);
        }
        return answer;
    }
}
