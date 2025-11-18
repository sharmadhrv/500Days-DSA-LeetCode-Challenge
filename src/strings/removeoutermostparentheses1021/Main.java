package strings.removeoutermostparentheses1021;

public class Main {

    public static void main(String[] args) {

        RemoveParentheses removeParentheses = new RemoveParentheses();
        String s = "(()())(())";
        System.out.println(removeParentheses.removeParentheses(s));
    }
}
