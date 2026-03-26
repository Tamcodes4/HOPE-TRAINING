package DAY_6.problem_solved;
class Dconstructor{
    Dconstructor(int x){
        System.out.println("im inside parametised constructor"+x);
    }
}
public class defaultconstructor {
    public static void main(String[] args) {
        System.out.println("default constructor");
        Dconstructor sc = new Dconstructor(20);

    }
}
