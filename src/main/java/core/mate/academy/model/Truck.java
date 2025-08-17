package core.mate.academy.model;

public class Truck extends Machine {
    private int liftingCapacity;

    public Truck() {
    }

    public Truck(String name, String color, int liftingCapacity) {
        super(name, color);
        this.liftingCapacity = liftingCapacity;
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
