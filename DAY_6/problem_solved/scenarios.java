package DAY_6.problem_solved;
class Scenarios {
    public static void main(String[] args) {
        Scenarios ap1=new Scenarios(1,1,1,1,1,1);
        Scenarios ap2=new Scenarios(2,2,1,1,1,1);
        Scenarios ap3=new Scenarios(4, 4,1,1, 2, 1);
    }
    Scenarios(int room,int Washroom, int kitchen, int dininghall, int livingRoom, int playground){
        if(room==1){
            System.out.println("There is "+room+" room and "+Washroom+" not attached washroom and there is "+kitchen+" kitchen with "+dininghall+" not attached dining hall and there is "+livingRoom+" livingroom and "+playground+" playground");
        }
        else if(room==2){
             System.out.println("There is "+room+" rooms and "+Washroom+" attached washroom and there is "+kitchen+" kitchen with "+dininghall+" attached dining hall and there is "+livingRoom+" livingroom and "+playground+" playground");
        }
        else if(room==4){
            System.out.println("There is "+room+" rooms and "+Washroom+" attached washroom and there is "+kitchen+" kitchen with "+dininghall+" attached dining hall and there is "+livingRoom+" livingroom , one for each two room and "+playground+" playground");
        }
    }
}
