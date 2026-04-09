package DAY_12.task.model;

public abstract class Vehicle {
    protected String vehicleNo;
    protected String modelName;
    protected String fuelType;

    public Vehicle(String vehicleNo, String modelName, String fuelType) {
        this.vehicleNo = vehicleNo;
        this.modelName = modelName;
        this.fuelType = fuelType;
    }

    public abstract void display();
}
