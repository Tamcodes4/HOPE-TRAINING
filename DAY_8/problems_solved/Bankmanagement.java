package DAY_8.problems_solved;
//withraw,deposit,balance
class Function{
    String name;
    int pinnumber;
    int amount;
    int deposit;
    int balance;
    Function(String name, int pinnumber, int amount, int deposit, int balance){
        this.name=name;
        this.pinnumber=pinnumber;
        this.amount=amount;
        this.deposit=deposit;
        this.balance=balance;
    }
    void withdraw(){
        System.out.println("The account holder of "+name+"has withdraw the amount of"+amount);
        balance=balance-amount;
    }
    void deposit(){
        System.out.println("The account holder of "+name+"has deposited the amount of "+deposit);
        balance=balance+deposit;
    }
    void balance(){
        System.out.println("The account has the balance of "+balance);
    }
}
public class Bankmanagement {
    public static void main(String[] args) {
        Function f = new Function("elena", 12334, 2000, 3000, 10000);
        f.withdraw();
        f.balance();
        f.deposit();
    }
}
