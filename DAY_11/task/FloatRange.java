package DAY_11.task;

public class FloatRange {
    public static void main(String[] args) {
        Integer num = 127;
        Integer obj = 127;
        System.out.println(num == obj);//true
        Integer num2= 200;
        Integer obj1=200;
        System.out.println(num2 ==obj1);//false
        Float f1num = 127f;
        Float f2num =127f;
        System.out.println(f1num == f2num);//false 
    }
}