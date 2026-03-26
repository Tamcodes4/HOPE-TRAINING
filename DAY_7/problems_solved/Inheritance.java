class Animal{
    void display(){
        System.out.println("has multiple species");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.print("Dog barks");
    }
}
class Puppy extends Dog{
    void weeps(){
System.out.println("Dog weeps");
    }
}
public class Inheritance{
    public static void main(String[] args){
        Puppy sound = new Puppy();
        sound.bark();
        sound.display();
        sound.weeps();
        System.out.println("Dog Barks"+sound.hashCode());
    }
}