class Parent{
    public void display(){
        System.out.println("Inside parent class");
    }
}
class Child extends Parent{
    public void display1(){
        System.out.println("Inside child class");
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        System.out.println("Inside main class");
        Child ob = new Child();
        ob.display();
        ob.display1();
    }
}
