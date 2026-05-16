package greedy.nonoverlappinginterval435;

public class Main {

    public static void main(String[] args) {
        NonOverlappingInterval overlappingInterval= new NonOverlappingInterval();

        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(overlappingInterval.eraseOverlapIntervals(intervals));

    }
}
