
public class BulbSwitcher {
    public static void main(String[] args) {
        int n = 3;
        int result = bulbSwitch(n);
        System.out.println("Number of bulbs that remain on: " + result);
    }
    public static int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
        
    }
}