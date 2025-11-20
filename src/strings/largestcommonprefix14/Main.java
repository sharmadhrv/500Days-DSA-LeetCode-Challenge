package strings.largestcommonprefix14;

public class Main {

    public static void main(String[] args) {

        LargestCommonPrefix largestCommonPrefix = new LargestCommonPrefix();
        String[] strs ={"flower","flow","flight"};
        System.out.println(largestCommonPrefix.longestCommonPrefix(strs));
    }
}
