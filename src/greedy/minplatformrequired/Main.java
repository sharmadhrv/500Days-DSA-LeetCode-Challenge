package greedy.minplatformrequired;

public class Main {
    public static void main(String[] args) {

        PlatformRequired platformRequired = new PlatformRequired();
        int[] arrival = {900,945,955,1100,1500,1800};
        int[] departure = {920,1100,1130,1150,1900,2000};
        System.out.println(platformRequired.function(arrival, departure));
    }
}
