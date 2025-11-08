package arrays.majorityelement169;

public class Main {

    public static void main(String[] args) {

        MajorityElement majorityELement = new MajorityElement();
        int[] arr = {3,2,3,1,2,3,4,5,3,3,3};
        System.out.println(majorityELement.boyerMooreLaw(arr));
    }
}
