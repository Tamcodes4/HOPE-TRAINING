package DAY_3.task;
import java.util.Scanner;
public class subwaysufers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = 0;
            System.out.println("1.Run 2.Jump 3.Slide 4.Coin 5.Hit 6.Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("running");
                    break;

                case 2:
                    System.out.println("jumped");
                    break;

                case 3:
                    System.out.println("slide");
                    break;

                case 4:
                    System.out.println("coin earned");
                    break;

                case 5:
                    System.out.println("game over");
                    break;

                case 6:
                    System.out.println("exit");
                    break;

                default:
                    System.out.println("enter the correct input");
            }
            sc.close();
        }
}
