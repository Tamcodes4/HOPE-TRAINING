package DAY_12.task.car;
import DAY_12.task.vehicle.Vehicle;

public class Car extends Vehicle {

    public Car(String vehicleNo, String modelName, String fuelType) {
        super(vehicleNo, modelName, fuelType);
    }

    public void display() {
        System.out.println("Vehicle No : " + vehicleNo);
        System.out.println("Model : " + modelName);
        System.out.println("Fuel : " + fuelType);
    }
}
