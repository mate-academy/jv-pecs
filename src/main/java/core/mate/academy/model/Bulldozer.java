package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int lengthBlade;
    private int weightBlade;
    private int bladeCapacity;

    public Bulldozer() {
        super();
    }

    public int getLengthBlade() {
        return lengthBlade;
    }

    public void setLengthBlade(int lengthBlade) {
        this.lengthBlade = lengthBlade;
    }

    public int getWeightBlade() {
        return weightBlade;
    }

    public void setWeightBlade(int weightBlade) {
        this.weightBlade = weightBlade;
    }

    public int getBladeCapacity() {
        return bladeCapacity;
    }

    public void setBladeCapacity(int bladeCapacity) {
        this.bladeCapacity = bladeCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
