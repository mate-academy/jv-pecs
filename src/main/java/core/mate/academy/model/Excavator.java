package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int lengthArm;
    private double power;

    public Excavator() {
    }

    public Excavator(int lengthArm, double power) {
        this.lengthArm = lengthArm;
        this.power = power;
    }

    public int getLengthArm() {
        return lengthArm;
    }

    public double getPower() {
        return power;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
