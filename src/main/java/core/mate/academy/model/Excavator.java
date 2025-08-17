package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int scoopCapacity;
    private int scoopRadius;

    public Excavator() {
    }

    public Excavator(String name, String color, int scoopCapacity, int scoopRadius) {
        this.setName(name);
        this.setColor(name);
        this.scoopCapacity = scoopCapacity;
        this.scoopRadius = scoopRadius;
    }

    public int getScoopCapacity() {
        return scoopCapacity;
    }

    public void setScoopCapacity(int scoopCapacity) {
        this.scoopCapacity = scoopCapacity;
    }

    public int getScoopRadius() {
        return scoopRadius;
    }

    public void setScoopRadius(int scoopRadius) {
        this.scoopRadius = scoopRadius;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
