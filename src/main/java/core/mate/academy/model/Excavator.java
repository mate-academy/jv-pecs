package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double platformLength;

    public Excavator() {
    }

    public double getPlatformLength() {
        return platformLength;
    }

    public void setPlatformLength(double platformLength) {
        this.platformLength = platformLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
