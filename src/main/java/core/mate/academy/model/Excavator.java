package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int weightBounds;
    private int enginePower;

    public Excavator() {
    }

    public Excavator(int weightBounds, int enginePower) {
        this.weightBounds = weightBounds;
        this.enginePower = enginePower;
    }

    public int getWeightBounds() {
        return weightBounds;
    }

    public void setWeightBounds(int weightBounds) {
        this.weightBounds = weightBounds;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
