package Stack.minparenthesis921;

public class Main {

    public static void main(String[] args) {

        MinParenthesis minParenthesis = new MinParenthesis();
        String s = "()))((";
        System.out.println(minParenthesis.minAddtoMakeValid(s));
    }
}
