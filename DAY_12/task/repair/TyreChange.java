package DAY_12.task.repair;
import DAY_12.task.service.Service;

public class TyreChange extends Service {
    int tyreCount;

    public TyreChange(int tyreCount) {
        serviceName = "Tyre Change";
        this.tyreCount = tyreCount;
    }

    public double getPrice() {
        return tyreCount * 2500;
    }
}