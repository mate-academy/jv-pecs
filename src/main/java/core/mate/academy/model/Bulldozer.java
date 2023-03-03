package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int maxSpeed;
    private int maxWeightToTake;

    public Bulldozer() {
    }

    public Bulldozer(int maxWeightToTake, int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.maxWeightToTake = maxWeightToTake;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxWeightToTake() {
        return maxWeightToTake;
    }

    public void setMaxWeightToTake(int maxWeightToTake) {
        this.maxWeightToTake = maxWeightToTake;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
