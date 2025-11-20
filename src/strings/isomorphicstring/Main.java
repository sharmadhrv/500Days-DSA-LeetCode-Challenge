package strings.isomorphicstring;

public class Main {

    public static void main(String[] args) {

        IsoMorphicString isoMorphicString = new IsoMorphicString();
        String s = "bbbaaaba";
        String t = "aaabbbba";
        System.out.println(isoMorphicString.isIsomorphic(s,t));
    }
}
