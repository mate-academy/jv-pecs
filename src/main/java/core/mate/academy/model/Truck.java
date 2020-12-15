package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private boolean haveTank;
    private int liftingCapacity;

    public Truck() {
    }

    public Truck(String name, String color, boolean haveTank, int liftingCapacity) {
        setName(name);
        setColor(color);
        this.haveTank = haveTank;
        this.liftingCapacity = liftingCapacity;
    }

    public boolean isHaveTank() {
        return haveTank;
    }

    public void setHaveTank(boolean haveTank) {
        this.haveTank = haveTank;
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
