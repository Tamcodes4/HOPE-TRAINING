class Details{
    String name;
    String id;
    long phno;
    Details(String name, String id, long phno){
        this.name=name;
        this.id=id;
        this.phno=phno;
    }
    void display(){
        System.out.println(name+" "+id+" "+phno);
    }
}
public class Thiskeyword {
    public static void main(String[] args) {
        Details dd = new Details("aiden","ts2367" , 2123435540);
        dd.display();
        Details dd1 = new Details("alex","cs4567",23456789);
        dd1.display();
        Details dd2 = new Details("adam", "wes2434", 2345367);
        dd2.display();
    }
}
