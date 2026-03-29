package greedy.assigncookies455;

public class Main {
    public static void main(String[] args) {
        AssignCookies assignCookies = new AssignCookies();
        int[] g = {1,2,3};
        int[] s = {3};
        System.out.println(assignCookies.findContentChildren(g,s));
    }
}
