package DAY_12.task.service;

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