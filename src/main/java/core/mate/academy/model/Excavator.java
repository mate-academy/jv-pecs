package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int maxSpeed;
    private int maxLoad;

    public Excavator() {
    }

    public Excavator(int maxSpeed, int maxLoad) {
        this.maxSpeed = maxSpeed;
        this.maxLoad = maxLoad;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }
}
