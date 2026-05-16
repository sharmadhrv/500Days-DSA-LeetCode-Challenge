package greedy.nmeetinginoneroom;

public class Main {

    public static void main(String[] args) {
        NMeeting nMeeting= new NMeeting();

        int[] start = {0,3,1,5,5,8};
        int[] end = {5,4,2,9,7,9};
        System.out.println(nMeeting.count(start, end));
    }
}
