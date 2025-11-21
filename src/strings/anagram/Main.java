package strings.anagram;

public class Main {

    public static void main(String[] args) {

        Anagrams anagrams = new Anagrams();
        String s ="baba";
        String t = "abab";
        System.out.println(anagrams.isAnagram2(s,t));
    }
}
