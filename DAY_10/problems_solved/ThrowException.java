package DAY_10.problems_solved;

public class ThrowException {
    public static void main(String[] args) {
        int age = 15;
        if(age<=18){
            throw new ArithmeticException("not eligible to continue");
        }

    }
}
