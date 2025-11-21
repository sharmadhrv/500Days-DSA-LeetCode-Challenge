package strings.stringtointeger;

public class Main {

    public static void main(String[] args) {

        StringToInteger stringToInteger = new StringToInteger();
        String s = "        -000000000000000402";
        System.out.println(stringToInteger.myAtoi(s));
    }
}
