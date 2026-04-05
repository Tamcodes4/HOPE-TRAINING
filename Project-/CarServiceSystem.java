import java.util.*;

abstract class Vehicle {
    String vehicleNo;
    String modelName;
    String fuelType;

    Vehicle(String vehicleNo, String modelName, String fuelType) {
        this.vehicleNo = vehicleNo;
        this.modelName = modelName;
        this.fuelType = fuelType;
    }

    abstract void display();
}

class Car extends Vehicle {

    Car(String vehicleNo, String modelName, String fuelType) {
        super(vehicleNo, modelName, fuelType);
    }

    void display() {
        System.out.println("Vehicle No:" + vehicleNo);
        System.out.println("Model:" + modelName);
        System.out.println("Fuel:" + fuelType);
    }
}

class Customer {
    private String customerName;
    private String phoneNo;

    Customer(String customerName, String phoneNo) {
        this.customerName = customerName;
        this.phoneNo = phoneNo;
    }

    String getName() {
        return customerName;
    }

    String getPhone() {
        return phoneNo;
    }

    void isValid() {
        try {
            if (customerName.equals("") || phoneNo.length() != 10) {
                throw new Exception("invalid, check the details correctly");
            }
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}

abstract class Service {
    String serviceName;
    abstract double getPrice();
}

class OilChange extends Service {

    OilChange() {
        serviceName = "oil change";
    }

    double getPrice() {
        return 1500;
    }
}

class Repair extends Service {
    double partsCost;

    Repair(double partsCost) {
        serviceName = "repair";
        this.partsCost = partsCost;
    }

    double getPrice() {
        return 2000 + partsCost;
    }
}

class TyreChange extends Service {
    int tyreCount;

    TyreChange(int tyreCount) {
        serviceName = "tyre change";
        this.tyreCount = tyreCount;
    }

    double getPrice() {
        return tyreCount * 2500;
    }
}

public class CarServiceSystem {
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
