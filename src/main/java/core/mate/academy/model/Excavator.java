package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bladeWeight;
    private int bladeLength;

    public Excavator() {
    }

    public Excavator(String name, String color, int bladeLength, int bladeWeight) {
        super(name, color);
        this.bladeLength = bladeLength;
        this.bladeWeight = bladeWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getBladeWeight() {
        return bladeWeight;
    }

    public void setBladeWeight(int bladeWeight) {
        this.bladeWeight = bladeWeight;
    }

    public int getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(int bladeLength) {
        this.bladeLength = bladeLength;
    }
}
