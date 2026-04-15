
public class NumWaterBottles {
    public static void main(String[] args) {
        int numBottles = 9;
        int numExchange = 3;
        int result = numWaterBottles(numBottles, numExchange);
        System.out.println("Total water bottles consumed: " + result);
    }
    public static int numWaterBottles(int numBottles, int numExchange) {
        int consumed=numBottles;
        while(numBottles >= numExchange){
            int newBottles = numBottles / numExchange;
            int left = numBottles % numExchange;
            consumed += newBottles;
            numBottles = left + newBottles;
        }
        return consumed;
    }
}