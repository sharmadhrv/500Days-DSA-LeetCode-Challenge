package greedy.frogjump;

public class Main {

    public static void main(String[] args) {

        FrogJump frogJump = new FrogJump();
        int[] heights = {20,30,40,20};
        System.out.println(frogJump.minCost3(heights));
    }
}
