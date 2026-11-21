package graphs.cheapestflightwithkstop787;

public class Main {

    public static void main(String[] args) {

        CheapestFlight cheapestFlight = new CheapestFlight();

        int[][] flights = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};

        System.out.println(cheapestFlight.findCheapestPrice(4,flights,0,3,1));
    }
}
