package DAY_12.task.main;

import DAY_12.task.model.Car;
import DAY_12.task.model.Customer;
import DAY_12.task.service.OilChange;
import DAY_12.task.service.Repair;
import DAY_12.task.service.Service;
import DAY_12.task.service.TyreChange;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("TN14AD1123", "honda", "diesel");
        c1.display();
        Customer cust1 = new Customer("tamil", "9847012345");
        Customer cust2 = new Customer("", "123");
        cust1.isValid();
        cust2.isValid();
        Service sv1 = new OilChange();
        Service sv2 = new Repair(3500);
        Service sv3 = new TyreChange(2);
        System.out.println(sv1.serviceName + " rs:" + sv1.getPrice());
        System.out.println(sv2.serviceName + " rs:" + sv2.getPrice());
        System.out.println(sv3.serviceName + " rs:" + sv3.getPrice());

    }
}