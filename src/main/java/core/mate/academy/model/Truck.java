package core.mate.academy.model;

public class Truck extends Machine {
    private String truckType;

    public Truck() {

    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public String getTruckType() {
        return truckType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
