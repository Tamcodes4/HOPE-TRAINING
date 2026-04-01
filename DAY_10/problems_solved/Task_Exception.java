package DAY_10.problems_solved;

public class Task_Exception {
    public static void main(String[] args) {
        int [] arr = new int[3];
        try{
            arr[4]=12;
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
