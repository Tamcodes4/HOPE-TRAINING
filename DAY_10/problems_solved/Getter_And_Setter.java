package DAY_10.problems_solved;
class Name{
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

}
public class Getter_And_Setter {
    public static void main(String[] args) {
        Name ob = new Name();
        ob.setName("jus cuz");
        System.out.println(ob.getName());
    }
}
