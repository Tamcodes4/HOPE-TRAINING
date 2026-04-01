package DAY_10.problems_solved;
interface A{
    void show();
}
class B implements A{
    public void show(){
        System.out.println("hi");
    }
}
class C implements A{
    public void show(){
        System.out.println("hey");
    }
}
public class Interface {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        C c = new C();
        c.show();
    }
}
