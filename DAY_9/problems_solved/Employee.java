package DAY_9.problems_solved;
abstract class Employeed{
    abstract void monthlysalary();

}
class Fulltime extends Employeed{
    String name;
    int monthlysalary;
    Fulltime(String name,int monthlysalary){
        this.name=name;
        this.monthlysalary=monthlysalary;
    }
    public void monthlysalary(){
        System.out.println("The salary of "+name+" who is a full time employer has been credited with "+monthlysalary);
    }
}
class Parttime extends Employeed{
    String name;
    int rate;
    int time;
    Parttime(String name, int rate, int time){
        this.time=time;
        this.name=name;
        this.rate=rate;
    }
    public void monthlysalary(){
        rate = rate*time;
        System.out.println("The salary of "+name+" who is a part time employer has been credited with "+rate);
    }
}
class Employee {
    public static void main(String[] args){
        Parttime ob = new Parttime("dorian", 100, 6);
        Fulltime ob1 = new Fulltime("lucas", 12000);
        ob.monthlysalary();
        ob1.monthlysalary();
        }
}
