class Father{
    void display(){
        System.out.println("has one daughter and one son");
    }
}
class Son extends Father{
    void job(){
        System.out.println("since you hav a job, business goes to sister");
    }
}
class Daughter extends Father{
    void notAccepting(){
        System.out.println("have my own business to run, handover it to the son");
    }
}
public class Heirarchicalinheritance {
    public static void main(String[] args) {
        Son son = new Son();
        son.display();
        son.job();
        Daughter daughter = new Daughter();
        daughter.display();
        daughter.notAccepting();
    }
}
