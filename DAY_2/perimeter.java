package DAY_2;
import java.util.*;
public class perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len,br;
        System.out.print("enter the length");
        len = sc.nextInt();
        System.out.print("enter the breadth");
        br = sc.nextInt();  
        System.out.print("Perimeter"+ (2*(len+br)));
        sc.close();
    }
}
