package core.mate.academy.model;

public class Truck extends Machine {
    private String cargoType;
    private int maxLoad;

    public Truck() {
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
