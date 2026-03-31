package DAY_9.problems_solved;
interface A{
    void show();
}
interface B{
    void display();
}
class C implements A,B{
        public void show(){
            System.out.println("yoo");
        }
        public void display(){
            System.out.println("yoo");
        }
}
public class Interface_Example {
    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
}
