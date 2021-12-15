package core.mate.academy.model;

public class Truck extends Machine {
    private int liftingCapacity;

    public Truck() {
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
