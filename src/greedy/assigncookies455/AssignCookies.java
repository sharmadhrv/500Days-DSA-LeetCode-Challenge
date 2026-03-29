package greedy.assigncookies455;

import java.util.Arrays;

public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int child=0,cookie=0;
        while(cookie<s.length && child<g.length)
        {
           if(g[child]<=s[cookie])
               child+=1;
           cookie++;
        }
        return child;
    }
}
