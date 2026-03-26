package DAY_6.problem_solved;
class Innerclassobject {
public void display(){
    System.out.println("inside the inner class");
}
    
}
public class classobject {
    public static void main(String[] args) {
        System.out.println("inside main class");
        Innerclassobject sc = new Innerclassobject();
        sc.display();
    }
}
