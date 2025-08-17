package core.mate.academy.model;

public class Truck extends Machine {
    private int liftingCapacity;
    private String truckBodyType;

    public Truck() {
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    public String getTruckBodyType() {
        return truckBodyType;
    }

    public void setTruckBodyType(String truckBodyType) {
        this.truckBodyType = truckBodyType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
