package strings.indexofsubstring28;

public class Main {

    public static void main(String[] args) {

        SubStringIndex subStringIndex = new SubStringIndex();
        String hamstack = "mississippi";
        String needle = "issipi";
        System.out.println(subStringIndex.indexSubString(hamstack,needle));
    }
}
