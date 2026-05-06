package greedy.jobsequencingproblem;

public class Main {
    public static void main(String[] args) {

        JobSequencing js = new JobSequencing();

        JobSequencing.Node[] jobs = {
                new JobSequencing.Node(1, 4, 20),
                new JobSequencing.Node(2, 5, 60),
                new JobSequencing.Node(3, 6, 70),
                new JobSequencing.Node(4, 6, 65),
                new JobSequencing.Node(5, 4, 25),
                new JobSequencing.Node(6, 2, 80),
                new JobSequencing.Node(7, 2, 10),
                new JobSequencing.Node(8, 2, 22)
        };

        int[] result = js.jobSequencing(jobs);

        System.out.println("Total Jobs Done: " + result[0]);
        System.out.println("Total Profit: " + result[1]);
    }
}