package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int armLength;

    public Excavator() {
    }

    public Excavator(String name, String color, int armLength) {
        super(name, color);
        this.armLength = armLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getArmLength() {
        return armLength;
    }

    public void setArmLength(int armLength) {
        this.armLength = armLength;
    }
}
