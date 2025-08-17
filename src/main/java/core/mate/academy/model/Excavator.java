package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int scoopCapacity;

    public Excavator() {
    }

    public Excavator(String name, String color, int scoopCapacity) {
        super(name, color);
        this.scoopCapacity = scoopCapacity;
    }

    public int getScoopCapacity() {
        return scoopCapacity;
    }

    public void setScoopCapacity(int scoopCapacity) {
        this.scoopCapacity = scoopCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
