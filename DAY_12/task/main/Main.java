package DAY_12.task.main;

import DAY_12.task.car.Car;
import DAY_12.task.customer.Customer;
import DAY_12.task.repair.OilChange;
import DAY_12.task.repair.Repair;
import DAY_12.task.repair.TyreChange;
import DAY_12.task.service.Service;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("KL07AB1234", "Maruti Swift", "Petrol");
        c1.display();
        System.out.println();
        Customer cust1 = new Customer("Arun", "9847012345");
        Customer cust2 = new Customer("", "123");
        cust1.isValid();
        cust2.isValid();
        System.out.println();
        Service sv1 = new OilChange();
        Service sv2 = new Repair(3500);
        Service sv3 = new TyreChange(2);
        System.out.println(sv1.serviceName + " - Rs." + sv1.getPrice());
        System.out.println(sv2.serviceName + " - Rs." + sv2.getPrice());
        System.out.println(sv3.serviceName + " - Rs." + sv3.getPrice());
    }
}