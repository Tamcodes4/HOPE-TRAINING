
public class ClimbStairs {
    public static void main(String[] args) {
        int n = 5;
        int result = climbStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + result);
    }
    public static int climbStairs(int n) {
        if(n<=2)    return n;
        int first=1;
        int second=2;
        for(int i=3;i<=n;i++){
            int third=first+second;
            first=second;
            second=third;
        }
        return second;
    }
}