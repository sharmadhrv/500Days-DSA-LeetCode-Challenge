package strings.commonprefix14;

public class Main {
    public static void main(String[] args) {
        CommonPrefix commonPrefix = new CommonPrefix();
        String[] strs = {"flower","flow","flight"};
        System.out.println(commonPrefix.longestCommonPrefix(strs));
    }
}
