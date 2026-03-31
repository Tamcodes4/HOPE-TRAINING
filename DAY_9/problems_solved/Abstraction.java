package DAY_9.problems_solved;
abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("barking");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("meaoww");
    }
}

class Abstraction {
    public static void main(String[] args) {
        Dog ob = new Dog();
        Cat ob1 = new Cat();
        ob.sound();
        ob1.sound();
    }
}
