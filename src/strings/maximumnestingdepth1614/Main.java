package strings.maximumnestingdepth1614;

public class Main {

    public static void main(String[] args) {

        MaxDepthParentheses maxDepthParentheses = new MaxDepthParentheses();
        String s = "(1)+((2))+(((3)))";
        System.out.println(maxDepthParentheses.maxDepth(s));
    }
}
