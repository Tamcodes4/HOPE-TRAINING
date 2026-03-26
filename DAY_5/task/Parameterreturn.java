package DAY_5.task;

public class Parameterreturn {
    public static void main(String[] args){
        Parameterreturn obj = new Parameterreturn();

        int num1 = 7, num2 = 3;

        System.out.println(addWithParams(num1, num2));
        System.out.println(addWithoutParams());

        obj.displaySumWithParams(num1, num2);
        obj.displaySumWithoutParams();
    }

    public static int addWithParams(int a, int b){
        System.out.println("With parameters and return type");
        return a + b;
    }

    public static int addWithoutParams(){
        int x = 20, y = 5;
        System.out.println("Without parameters but with return type");
        return x + y;
    }

    public void displaySumWithParams(int a, int b){
        System.out.println("With parameters and no return type");
        System.out.println(a + b);
    }

    public void displaySumWithoutParams(){
        int x = 15, y = 5;
        System.out.println("Without parameters and no return type");
        System.out.println(x + y);
    }
}
