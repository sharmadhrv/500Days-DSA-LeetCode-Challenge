package recursion.skipsubstring;

public class Main {

    public static void main(String[] args) {
        SkipSubString skip = new SkipSubString();
        String s = "bccdappledfg";
        String pattern = "ccd";
        System.out.println(skip.skipSubString(pattern,s));
    }
}
