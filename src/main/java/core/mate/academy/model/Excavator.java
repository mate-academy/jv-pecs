package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int scoopCapacity;
    private int armLength;

    public Excavator(int scoopCapacity, int armLength, String name, String color) {
        this.scoopCapacity = scoopCapacity;
        this.armLength = armLength;
        super.setName(name);
        super.setColor(color);
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
