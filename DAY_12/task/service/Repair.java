package DAY_12.task.repair;

import DAY_12.task.service.Service;

public class Repair extends Service {
    double partsCost;

    public Repair(double partsCost) {
        serviceName = "Repair";
        this.partsCost = partsCost;
    }

    public double getPrice() {
        return 2000 + partsCost;
    }
}