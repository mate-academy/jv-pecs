package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int maxPower;

    public Excavator() {
    }

    public Excavator(int maxSpeed) {
        this.maxPower = maxSpeed;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
