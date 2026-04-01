package DAY_10.problems_solved;
public class CheckedException {
    public static void main(String[] args) {
        try{
           int a = 10/0;
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
