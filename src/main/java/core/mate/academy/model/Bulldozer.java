package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeCapacity;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getBladeCapacity() {
        return bladeCapacity;
    }

    public void setBladeCapacity(int bladeCapacity) {
        this.bladeCapacity = bladeCapacity;
    }
}
