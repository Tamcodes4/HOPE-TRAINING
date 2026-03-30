package DAY_8.problems_solved;

class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}
class Overriding{
    public static void main(String[] args){
        Animal a1;
        a1=new Dog();
        a1.sound();
        a1=new Cat();
        a1.sound();
    }
}