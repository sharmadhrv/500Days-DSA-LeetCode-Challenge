package strings.stringcompression443;

public class Main {

    public static void main(String[] args) {

        StringCompression stringCompression = new StringCompression();

        char[]chars = {'a','a','b','b','b','b','c','c','c'};
        System.out.println(stringCompression.compress(chars));
    }
}
