class Animal{
    void display(){
        System.out.println("has multiple species");
    }
}
class Dog{
    void bark(){
        System.out.print("Dog barks");
    }
}
public class Inheritance{
    public static void main(String[] args){
        Dog sound = new Dog();
        sound.bark();
        System.out.println("Dog Barks"+sound.hashCode());
    }
}