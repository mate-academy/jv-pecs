package core.mate.academy.model;

public class Truck extends Machine {
    private int carryingCapacity;
    private int efficiency;

    public Truck() {
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
