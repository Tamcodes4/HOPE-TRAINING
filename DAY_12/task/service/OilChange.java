package DAY_12.task.repair;

import DAY_12.task.service.Service;

public class OilChange extends Service {

    public OilChange() {
        serviceName = "Oil Change";
    }

    public double getPrice() {
        return 1500;
    }
}