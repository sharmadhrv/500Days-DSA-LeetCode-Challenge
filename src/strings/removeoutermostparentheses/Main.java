package strings.removeoutermostparentheses;

public class Main {

    public static void main(String[] args) {

        RemoveParentheses removeParentheses = new RemoveParentheses();
        String s = "(()())(())";
        System.out.println(removeParentheses.removeParentheses(s));
    }
}
