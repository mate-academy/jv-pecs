package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeWeight;
    private int numberOfRippers;

    public Bulldozer() {
    }

    public int getBladeWeight() {
        return bladeWeight;
    }

    public int getNumberOfRippers() {
        return numberOfRippers;
    }

    public void setBladeWeight(int bladeWeight) {
        this.bladeWeight = bladeWeight;
    }

    public void setNumberOfRippers(int numberOfRippers) {
        this.numberOfRippers = numberOfRippers;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
