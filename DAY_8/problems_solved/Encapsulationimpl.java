package DAY_8.problems_solved;
class Encapsulation{
    int b;
    Encapsulation(int a){
         b=a;
    }
    void display(){
        System.out.println(b);
    }
}
public class Encapsulationimpl {
    public static void main(String[] args) {
        Encapsulation en = new Encapsulation(10);
        en.display();
    }
}
