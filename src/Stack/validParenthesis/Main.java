package Stack.validParenthesis;

public class Main {

    public static void main(String[] args) {

        ValidParenthesis parenthesis = new ValidParenthesis();
        String s = "]";
        System.out.println(parenthesis.isValid(s));
    }
}
