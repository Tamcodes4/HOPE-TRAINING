package DAY_9.problems_solved;
interface Payment_Methods{
    void creditcard();
    void upi();
    void cashondelivery();
}
class Credit implements Payment_Methods{
    int cardno,pin,amount;
    Credit(int cardno, int pin, int amount){
        this.cardno=cardno;
        this.pin=pin;
        this.amount=amount;
    }
    
    public void creditcard(){
        System.out.println("The card no:"+cardno+"\n"+"The card pin "+pin+"\n"+"the amount withdrawn"+amount);
    }
    public void upi(){
        System.out.println("The upi id:"+"\n"+"The card pin"+"\n"+"The amount withdrawn");
    }
    public void cashondelivery(){
        System.out.println("The cash given to the cash counter");
    }
    
}

public class Paymentmethods {
    public static void main(String[] args) {
        Credit cd = new Credit(0, 0, 0);
        cd.creditcard();
    }
}
